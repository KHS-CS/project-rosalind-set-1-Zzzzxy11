public class ProblemDNA
{
    public static void main() {
        // replace this string with the one from Project Rosalind
        final String data = "TCCAAGGACTATGAGTCACGATCTGTGGCTTATGAAAGTCTGTAAGAGGTCTGAGGCCACATAGTGCTTACGCAAATTGAGACCCATGCAGCATTAAGGAGTAAAGGCGCTTGCTATTCAATTAGACGCTTGGCATCGCGCTCGCTTCTTAGTATTGCCACGGCGTCGCGACTATACTTGCGTCTTGGCCAAAACAGCAAATGAAACTCTTACGGATACTATTGTCTTTTTAATAATACACACCCGGCACGATCTACCGGAGTTCCATCTTCGATCCTCCGATAATAATATCGAATAGCTGGGTGTGCTTAATAGTCGTTCTCCACTCGCATCAGGGATCCGCTTATACCAGTCTAATGGTTCAGGAAACCGCCCAGCATCACAGGTGAATCTGTGTCCCAGGTACAACCGGTAGTCGCGGCATAGTATCAGATATAGTACCTCGAGATAGAACTGCAAGCGTCTCCCCGAGGATACGATCCCTGTCACATCAGCTAGGTGGGTTAGATTAATCACCTGTGCACGACTTGTCGATACACCAGATGTACCCTTTCGGCAATGAATAAAACCGAGAAATCAGAATGGCTTCAAACGTTTGTGCCACTGTCCTATGTAGATATGCTTATGCGAGCCGTAAGGAGGTAGAATGCACGCAAGAGATTCATGAGTCCGAAACCCATGCCGTGGTACGAAGAAGAAGTACGAATGCTGTGTTCGCGGGCAATACGTTTGGCTCATGCCGTGGTCTCAGTGGAGAATCCCCGATCGGCTCAACGGACGTCTTCCCTCTGAGGGACGGGATCTTGCTGTGTATAGACTAGAGAGTTTCAGCCACGGTGTTTGCCATTTTCCACCTGACGTGCGCGGATCTAAGGCTAGAAGGAAAACACGTTAACGTCTTACACGTACATAACACTGCGGCTTCATTAGTCGAACCCGGGTCGAGCCGAGTTTTG";

        final int[] exampleExpectedCounts = new int[]{20,12,17,21};
        int[] output = nucleotideCounts(data);
        // you can copy and paste from the terminal window into 
        //   Project Rosalind to check your answer
        System.out.println(formatData(output));
    }
    
    // This should take the array of counts and return a 
    //   space-delimited String with the respective counts
    //   in A C G T order
    private static String formatData(int[] counts) {
        String output = "";
        for( int count : counts ) {
            output += count + " ";
        }
        return output; 
    }
    
    private static int[] nucleotideCounts(String dnaString) {
        int[] counts = new int[4];
        for (int i = 0; i < dnaString.length(); i++) {
            char c = dnaString.charAt(i);
            if (c == 'A') {
                counts[0]++;
            } else if (c =='C') {
                counts[1]++;
            }
             else if (c =='G') {
                counts[2]++;
            }
             else if (c =='T') {
                counts[3]++;
            }
            }
            return counts;
        
    }
