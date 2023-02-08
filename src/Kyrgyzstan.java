public enum Kyrgyzstan {
    BATCEN("Oruk"),
    CHUI("Borbor"),
    OSH("samsa"),
    DJAL_ALABAT("jangak"),
    NAARYN("et"),
    YSYK_KOL("balyk"),
    TALAS("talas");

    private String j;

    Kyrgyzstan(String j) {
        this.j = j;
    }

    public String getJ() {
        return j;
    }

    public void setJ(String j) {
        this.j = j;
    }
}
