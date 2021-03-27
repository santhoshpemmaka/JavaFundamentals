package instance;

public class Browser {
    public void navigation(String address){
        String ipAdress = getIpaddress(address);
        String htmlPage = getHtmlpage(ipAdress);
        System.out.println(htmlPage);
    }

    private String getIpaddress(String address) {
        return "120.0.10.19";
    }

    private String getHtmlpage(String ipAdress) {
        return "<html></html>";
    }
}
