@isTest
private class OASSSIOAccountPMPNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASSSIOAccountPMPName ssIOAccountPMPName1 = OASSSIOAccountPMPName.getExample();
        OASSSIOAccountPMPName ssIOAccountPMPName2 = ssIOAccountPMPName1;
        OASSSIOAccountPMPName ssIOAccountPMPName3 = new OASSSIOAccountPMPName();
        OASSSIOAccountPMPName ssIOAccountPMPName4 = ssIOAccountPMPName3;

        System.assert(ssIOAccountPMPName1.equals(ssIOAccountPMPName2));
        System.assert(ssIOAccountPMPName2.equals(ssIOAccountPMPName1));
        System.assert(ssIOAccountPMPName1.equals(ssIOAccountPMPName1));
        System.assert(ssIOAccountPMPName3.equals(ssIOAccountPMPName4));
        System.assert(ssIOAccountPMPName4.equals(ssIOAccountPMPName3));
        System.assert(ssIOAccountPMPName3.equals(ssIOAccountPMPName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSSIOAccountPMPName ssIOAccountPMPName1 = OASSSIOAccountPMPName.getExample();
        OASSSIOAccountPMPName ssIOAccountPMPName2 = OASSSIOAccountPMPName.getExample();
        OASSSIOAccountPMPName ssIOAccountPMPName3 = new OASSSIOAccountPMPName();
        OASSSIOAccountPMPName ssIOAccountPMPName4 = new OASSSIOAccountPMPName();

        System.assert(ssIOAccountPMPName1.equals(ssIOAccountPMPName2));
        System.assert(ssIOAccountPMPName2.equals(ssIOAccountPMPName1));
        System.assert(ssIOAccountPMPName3.equals(ssIOAccountPMPName4));
        System.assert(ssIOAccountPMPName4.equals(ssIOAccountPMPName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSSIOAccountPMPName ssIOAccountPMPName1 = OASSSIOAccountPMPName.getExample();
        OASSSIOAccountPMPName ssIOAccountPMPName2 = new OASSSIOAccountPMPName();

        System.assertEquals(false, ssIOAccountPMPName1.equals('foo'));
        System.assertEquals(false, ssIOAccountPMPName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSSIOAccountPMPName ssIOAccountPMPName1 = OASSSIOAccountPMPName.getExample();
        OASSSIOAccountPMPName ssIOAccountPMPName2 = new OASSSIOAccountPMPName();
        OASSSIOAccountPMPName ssIOAccountPMPName3;

        System.assertEquals(false, ssIOAccountPMPName1.equals(ssIOAccountPMPName3));
        System.assertEquals(false, ssIOAccountPMPName2.equals(ssIOAccountPMPName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSSIOAccountPMPName ssIOAccountPMPName1 = OASSSIOAccountPMPName.getExample();
        OASSSIOAccountPMPName ssIOAccountPMPName2 = new OASSSIOAccountPMPName();

        System.assertEquals(ssIOAccountPMPName1.hashCode(), ssIOAccountPMPName1.hashCode());
        System.assertEquals(ssIOAccountPMPName2.hashCode(), ssIOAccountPMPName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSSIOAccountPMPName ssIOAccountPMPName1 = OASSSIOAccountPMPName.getExample();
        OASSSIOAccountPMPName ssIOAccountPMPName2 = OASSSIOAccountPMPName.getExample();
        OASSSIOAccountPMPName ssIOAccountPMPName3 = new OASSSIOAccountPMPName();
        OASSSIOAccountPMPName ssIOAccountPMPName4 = new OASSSIOAccountPMPName();

        System.assert(ssIOAccountPMPName1.equals(ssIOAccountPMPName2));
        System.assert(ssIOAccountPMPName3.equals(ssIOAccountPMPName4));
        System.assertEquals(ssIOAccountPMPName1.hashCode(), ssIOAccountPMPName2.hashCode());
        System.assertEquals(ssIOAccountPMPName3.hashCode(), ssIOAccountPMPName4.hashCode());
    }
}
