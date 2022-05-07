@isTest
private class OASAdAccountTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdAccount adAccount1 = OASAdAccount.getExample();
        OASAdAccount adAccount2 = adAccount1;
        OASAdAccount adAccount3 = new OASAdAccount();
        OASAdAccount adAccount4 = adAccount3;

        System.assert(adAccount1.equals(adAccount2));
        System.assert(adAccount2.equals(adAccount1));
        System.assert(adAccount1.equals(adAccount1));
        System.assert(adAccount3.equals(adAccount4));
        System.assert(adAccount4.equals(adAccount3));
        System.assert(adAccount3.equals(adAccount3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdAccount adAccount1 = OASAdAccount.getExample();
        OASAdAccount adAccount2 = OASAdAccount.getExample();
        OASAdAccount adAccount3 = new OASAdAccount();
        OASAdAccount adAccount4 = new OASAdAccount();

        System.assert(adAccount1.equals(adAccount2));
        System.assert(adAccount2.equals(adAccount1));
        System.assert(adAccount3.equals(adAccount4));
        System.assert(adAccount4.equals(adAccount3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdAccount adAccount1 = OASAdAccount.getExample();
        OASAdAccount adAccount2 = new OASAdAccount();

        System.assertEquals(false, adAccount1.equals('foo'));
        System.assertEquals(false, adAccount2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdAccount adAccount1 = OASAdAccount.getExample();
        OASAdAccount adAccount2 = new OASAdAccount();
        OASAdAccount adAccount3;

        System.assertEquals(false, adAccount1.equals(adAccount3));
        System.assertEquals(false, adAccount2.equals(adAccount3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdAccount adAccount1 = OASAdAccount.getExample();
        OASAdAccount adAccount2 = new OASAdAccount();

        System.assertEquals(adAccount1.hashCode(), adAccount1.hashCode());
        System.assertEquals(adAccount2.hashCode(), adAccount2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdAccount adAccount1 = OASAdAccount.getExample();
        OASAdAccount adAccount2 = OASAdAccount.getExample();
        OASAdAccount adAccount3 = new OASAdAccount();
        OASAdAccount adAccount4 = new OASAdAccount();

        System.assert(adAccount1.equals(adAccount2));
        System.assert(adAccount3.equals(adAccount4));
        System.assertEquals(adAccount1.hashCode(), adAccount2.hashCode());
        System.assertEquals(adAccount3.hashCode(), adAccount4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdAccount adAccount = new OASAdAccount();
        Map<String, String> x-property-mappings = adAccount.getx-property-mappings();
        System.assertEquals('r_currency', x-property-mappings.get('currency'));
    }
}
