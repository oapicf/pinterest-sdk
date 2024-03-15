@isTest
private class OASCurrencyTest {
    @isTest
    private static void allowableValues() {
        Set<OASCurrency> expected = new Set<OASCurrency>{
            OASCurrency.UNK,
            OASCurrency.USD,
            OASCurrency.GBP,
            OASCurrency.CAD,
            OASCurrency.EUR,
            OASCurrency.AUD,
            OASCurrency.NZD,
            OASCurrency.SEK,
            OASCurrency.ILS,
            OASCurrency.CHF,
            OASCurrency.HKD,
            OASCurrency.JPY,
            OASCurrency.SGD,
            OASCurrency.KRW,
            OASCurrency.NOK,
            OASCurrency.DKK,
            OASCurrency.PLN,
            OASCurrency.RON,
            OASCurrency.HUF,
            OASCurrency.CZK,
            OASCurrency.BRL,
            OASCurrency.MXN,
            OASCurrency.ARS,
            OASCurrency.CLP,
            OASCurrency.COP
        };
        Set<OASCurrency> actual  = new Set<OASCurrency>(OASCurrency.values());
        System.assertEquals(expected, actual);
    }
}
