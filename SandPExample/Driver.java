/*

Jin An
DTCC
Sample Program

based on code from https://www.javainterviewpoint.com/how-to-read-and-parse-csv-file-in-java/
First example

 */

package csvPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Driver
{
    //Delimiters used in the CSV file
    private static final String COMMA_DELIMITER = ",";

    public static void main(String args[])
    {
        BufferedReader br = null;
        try
        {
            //Reading the csv file
            br = new BufferedReader(new FileReader("constituents_csv.csv"));

            //Create List for holding Employee objects
            // List<Company> companyList = new ArrayList<>();

            SandP sandp = new SandP();

            String line = "";
            //Read to skip the header
            br.readLine();
            //Reading from the second line
            while ((line = br.readLine()) != null)
            {
                String[] companyDetails = line.split(COMMA_DELIMITER);

                if(companyDetails.length > 0 )
                {
                    //Save the employee details in Employee object
                    /*
                    index:
                    0 - ticker
                    1 - company
                    2 - sector

                     */
                    /*
                    Company tempCompany = new Company();

                    tempCompany.setTicker(companyDetails[0]);
                    tempCompany.setCompany(companyDetails[1]);
                    tempCompany.setSector(companyDetails[2]);
                    */

                    Company tempCompany = new Company(companyDetails[0], companyDetails[1], companyDetails[2]);
                    sandp.addCompany(tempCompany);
                    //companyList.add(tempCompany);
                }
            }

            System.out.println(sandp);

            //Lets print the Employee List
            //for(Employee e : companyList)
            //{
            //    System.out.println(e.getEmpId()+"   "+e.getFirstName()+"   "
            //            +e.getLastName()+"   "+e.getSalary());
            //}
        }
        catch(Exception ee)
        {
            System.out.println("Catching the exception!");
            ee.printStackTrace();
        }
        finally
        {
            try
            {
                br.close();
            }
            catch(IOException ie)
            {
                System.out.println("Error occured while closing the BufferedReader");
                ie.printStackTrace();
            }
            catch(Exception moreGeneral) {
                moreGeneral.printStackTrace();
            }
        }
        System.out.println("I didn't crash!!!");
    }
}
