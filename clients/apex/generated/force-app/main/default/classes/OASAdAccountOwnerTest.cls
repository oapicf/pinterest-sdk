@isTest
private class OASAdAccountOwnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdAccountOwner adAccountOwner1 = OASAdAccountOwner.getExample();
        OASAdAccountOwner adAccountOwner2 = adAccountOwner1;
        OASAdAccountOwner adAccountOwner3 = new OASAdAccountOwner();
        OASAdAccountOwner adAccountOwner4 = adAccountOwner3;

        System.assert(adAccountOwner1.equals(adAccountOwner2));
        System.assert(adAccountOwner2.equals(adAccountOwner1));
        System.assert(adAccountOwner1.equals(adAccountOwner1));
        System.assert(adAccountOwner3.equals(adAccountOwner4));
        System.assert(adAccountOwner4.equals(adAccountOwner3));
        System.assert(adAccountOwner3.equals(adAccountOwner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdAccountOwner adAccountOwner1 = OASAdAccountOwner.getExample();
        OASAdAccountOwner adAccountOwner2 = OASAdAccountOwner.getExample();
        OASAdAccountOwner adAccountOwner3 = new OASAdAccountOwner();
        OASAdAccountOwner adAccountOwner4 = new OASAdAccountOwner();

        System.assert(adAccountOwner1.equals(adAccountOwner2));
        System.assert(adAccountOwner2.equals(adAccountOwner1));
        System.assert(adAccountOwner3.equals(adAccountOwner4));
        System.assert(adAccountOwner4.equals(adAccountOwner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdAccountOwner adAccountOwner1 = OASAdAccountOwner.getExample();
        OASAdAccountOwner adAccountOwner2 = new OASAdAccountOwner();

        System.assertEquals(false, adAccountOwner1.equals('foo'));
        System.assertEquals(false, adAccountOwner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdAccountOwner adAccountOwner1 = OASAdAccountOwner.getExample();
        OASAdAccountOwner adAccountOwner2 = new OASAdAccountOwner();
        OASAdAccountOwner adAccountOwner3;

        System.assertEquals(false, adAccountOwner1.equals(adAccountOwner3));
        System.assertEquals(false, adAccountOwner2.equals(adAccountOwner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdAccountOwner adAccountOwner1 = OASAdAccountOwner.getExample();
        OASAdAccountOwner adAccountOwner2 = new OASAdAccountOwner();

        System.assertEquals(adAccountOwner1.hashCode(), adAccountOwner1.hashCode());
        System.assertEquals(adAccountOwner2.hashCode(), adAccountOwner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdAccountOwner adAccountOwner1 = OASAdAccountOwner.getExample();
        OASAdAccountOwner adAccountOwner2 = OASAdAccountOwner.getExample();
        OASAdAccountOwner adAccountOwner3 = new OASAdAccountOwner();
        OASAdAccountOwner adAccountOwner4 = new OASAdAccountOwner();

        System.assert(adAccountOwner1.equals(adAccountOwner2));
        System.assert(adAccountOwner3.equals(adAccountOwner4));
        System.assertEquals(adAccountOwner1.hashCode(), adAccountOwner2.hashCode());
        System.assertEquals(adAccountOwner3.hashCode(), adAccountOwner4.hashCode());
    }
}
