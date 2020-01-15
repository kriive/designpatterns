package Structural.Adapter;

public class Adapter implements ClientInterface {
    private LegacyCode legacy = new LegacyCode();

    @Override
    public Integer getApiKey() {
        return Integer.parseInt(legacy.getApiKey());
    }
}
