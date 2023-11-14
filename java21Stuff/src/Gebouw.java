public record Gebouw(
        int verdiepingen,
        String kleur,
        String typeDak
) {
    public Gebouw verf(String nieuweKleur){
        return new Gebouw(verdiepingen, nieuweKleur,typeDak);
    }
}
