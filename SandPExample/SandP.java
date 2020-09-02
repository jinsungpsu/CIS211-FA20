package csvPractice;

public class SandP {
    private Company[] companies;
    private int count = 0;

    public SandP() {
        companies = new Company[500];
    }

    public void addCompany(Company company) {
        if (count < 500) {
            // if my array is full
            // create a new array
            // copy all the contents of my old array
            // then delete the old array
            // point the old ref var to the new array
            companies[count++] = company;
        } else {
            System.out.println("Can't add.  Too many great companies.");
        }
        /*
        companies[count] = company;
        count++;
         */
    }

    @Override
    public String toString() {
        StringBuilder o = new StringBuilder();
        for (Company e: companies) {
            o.append(e+"\n");
        }
        return o.toString();
    }
}
