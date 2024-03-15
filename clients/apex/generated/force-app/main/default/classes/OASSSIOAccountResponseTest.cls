@isTest
private class OASSSIOAccountResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASSSIOAccountResponse ssIOAccountResponse1 = OASSSIOAccountResponse.getExample();
        OASSSIOAccountResponse ssIOAccountResponse2 = ssIOAccountResponse1;
        OASSSIOAccountResponse ssIOAccountResponse3 = new OASSSIOAccountResponse();
        OASSSIOAccountResponse ssIOAccountResponse4 = ssIOAccountResponse3;

        System.assert(ssIOAccountResponse1.equals(ssIOAccountResponse2));
        System.assert(ssIOAccountResponse2.equals(ssIOAccountResponse1));
        System.assert(ssIOAccountResponse1.equals(ssIOAccountResponse1));
        System.assert(ssIOAccountResponse3.equals(ssIOAccountResponse4));
        System.assert(ssIOAccountResponse4.equals(ssIOAccountResponse3));
        System.assert(ssIOAccountResponse3.equals(ssIOAccountResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSSIOAccountResponse ssIOAccountResponse1 = OASSSIOAccountResponse.getExample();
        OASSSIOAccountResponse ssIOAccountResponse2 = OASSSIOAccountResponse.getExample();
        OASSSIOAccountResponse ssIOAccountResponse3 = new OASSSIOAccountResponse();
        OASSSIOAccountResponse ssIOAccountResponse4 = new OASSSIOAccountResponse();

        System.assert(ssIOAccountResponse1.equals(ssIOAccountResponse2));
        System.assert(ssIOAccountResponse2.equals(ssIOAccountResponse1));
        System.assert(ssIOAccountResponse3.equals(ssIOAccountResponse4));
        System.assert(ssIOAccountResponse4.equals(ssIOAccountResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSSIOAccountResponse ssIOAccountResponse1 = OASSSIOAccountResponse.getExample();
        OASSSIOAccountResponse ssIOAccountResponse2 = new OASSSIOAccountResponse();

        System.assertEquals(false, ssIOAccountResponse1.equals('foo'));
        System.assertEquals(false, ssIOAccountResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSSIOAccountResponse ssIOAccountResponse1 = OASSSIOAccountResponse.getExample();
        OASSSIOAccountResponse ssIOAccountResponse2 = new OASSSIOAccountResponse();
        OASSSIOAccountResponse ssIOAccountResponse3;

        System.assertEquals(false, ssIOAccountResponse1.equals(ssIOAccountResponse3));
        System.assertEquals(false, ssIOAccountResponse2.equals(ssIOAccountResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSSIOAccountResponse ssIOAccountResponse1 = OASSSIOAccountResponse.getExample();
        OASSSIOAccountResponse ssIOAccountResponse2 = new OASSSIOAccountResponse();

        System.assertEquals(ssIOAccountResponse1.hashCode(), ssIOAccountResponse1.hashCode());
        System.assertEquals(ssIOAccountResponse2.hashCode(), ssIOAccountResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSSIOAccountResponse ssIOAccountResponse1 = OASSSIOAccountResponse.getExample();
        OASSSIOAccountResponse ssIOAccountResponse2 = OASSSIOAccountResponse.getExample();
        OASSSIOAccountResponse ssIOAccountResponse3 = new OASSSIOAccountResponse();
        OASSSIOAccountResponse ssIOAccountResponse4 = new OASSSIOAccountResponse();

        System.assert(ssIOAccountResponse1.equals(ssIOAccountResponse2));
        System.assert(ssIOAccountResponse3.equals(ssIOAccountResponse4));
        System.assertEquals(ssIOAccountResponse1.hashCode(), ssIOAccountResponse2.hashCode());
        System.assertEquals(ssIOAccountResponse3.hashCode(), ssIOAccountResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSSIOAccountResponse ssIOAccountResponse = new OASSSIOAccountResponse();
        Map<String, String> x-property-mappings = ssIOAccountResponse.getx-property-mappings();
        System.assertEquals('canEdit', x-property-mappings.get('can_edit'));
        System.assertEquals('billtoInfos', x-property-mappings.get('billto_infos'));
        System.assertEquals('r_currency', x-property-mappings.get('currency'));
        System.assertEquals('pmpNames', x-property-mappings.get('pmp_names'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSSIOAccountResponse ssIOAccountResponse = new OASSSIOAccountResponse();
        System.assertEquals(new List<OASSSIOAccountItem>(), ssIOAccountResponse.billtoInfos);
        System.assertEquals(new List<OASSSIOAccountPMPName>(), ssIOAccountResponse.pmpNames);
        System.assertEquals(null, ssIOAccountResponse.eligible);
        System.assertEquals(null, ssIOAccountResponse.canEdit);
        System.assertEquals(null, ssIOAccountResponse.r_currency);
        System.assertEquals(null, ssIOAccountResponse.error);
    }
}
