@isTest
private class OASAdAccountCreateTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdAccountCreate adAccountCreate1 = OASAdAccountCreate.getExample();
        OASAdAccountCreate adAccountCreate2 = adAccountCreate1;
        OASAdAccountCreate adAccountCreate3 = new OASAdAccountCreate();
        OASAdAccountCreate adAccountCreate4 = adAccountCreate3;

        System.assert(adAccountCreate1.equals(adAccountCreate2));
        System.assert(adAccountCreate2.equals(adAccountCreate1));
        System.assert(adAccountCreate1.equals(adAccountCreate1));
        System.assert(adAccountCreate3.equals(adAccountCreate4));
        System.assert(adAccountCreate4.equals(adAccountCreate3));
        System.assert(adAccountCreate3.equals(adAccountCreate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdAccountCreate adAccountCreate1 = OASAdAccountCreate.getExample();
        OASAdAccountCreate adAccountCreate2 = OASAdAccountCreate.getExample();
        OASAdAccountCreate adAccountCreate3 = new OASAdAccountCreate();
        OASAdAccountCreate adAccountCreate4 = new OASAdAccountCreate();

        System.assert(adAccountCreate1.equals(adAccountCreate2));
        System.assert(adAccountCreate2.equals(adAccountCreate1));
        System.assert(adAccountCreate3.equals(adAccountCreate4));
        System.assert(adAccountCreate4.equals(adAccountCreate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdAccountCreate adAccountCreate1 = OASAdAccountCreate.getExample();
        OASAdAccountCreate adAccountCreate2 = new OASAdAccountCreate();

        System.assertEquals(false, adAccountCreate1.equals('foo'));
        System.assertEquals(false, adAccountCreate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdAccountCreate adAccountCreate1 = OASAdAccountCreate.getExample();
        OASAdAccountCreate adAccountCreate2 = new OASAdAccountCreate();
        OASAdAccountCreate adAccountCreate3;

        System.assertEquals(false, adAccountCreate1.equals(adAccountCreate3));
        System.assertEquals(false, adAccountCreate2.equals(adAccountCreate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdAccountCreate adAccountCreate1 = OASAdAccountCreate.getExample();
        OASAdAccountCreate adAccountCreate2 = new OASAdAccountCreate();

        System.assertEquals(adAccountCreate1.hashCode(), adAccountCreate1.hashCode());
        System.assertEquals(adAccountCreate2.hashCode(), adAccountCreate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdAccountCreate adAccountCreate1 = OASAdAccountCreate.getExample();
        OASAdAccountCreate adAccountCreate2 = OASAdAccountCreate.getExample();
        OASAdAccountCreate adAccountCreate3 = new OASAdAccountCreate();
        OASAdAccountCreate adAccountCreate4 = new OASAdAccountCreate();

        System.assert(adAccountCreate1.equals(adAccountCreate2));
        System.assert(adAccountCreate3.equals(adAccountCreate4));
        System.assertEquals(adAccountCreate1.hashCode(), adAccountCreate2.hashCode());
        System.assertEquals(adAccountCreate3.hashCode(), adAccountCreate4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdAccountCreate adAccountCreate = new OASAdAccountCreate();
        Map<String, String> x-property-mappings = adAccountCreate.getx-property-mappings();
        System.assertEquals('r_currency', x-property-mappings.get('currency'));
        System.assertEquals('ownerUserId', x-property-mappings.get('owner_user_id'));
    }
}
