public interface AksesSistem {
    // Abstract
    void login(String pin);
    void logout();

    // Default
    default String getRoleAkses() {
        return "Staff Biasa";
    }
}