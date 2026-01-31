@isTest
private class OASErrorDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASErrorDetail errorDetail1 = OASErrorDetail.getExample();
        OASErrorDetail errorDetail2 = errorDetail1;
        OASErrorDetail errorDetail3 = new OASErrorDetail();
        OASErrorDetail errorDetail4 = errorDetail3;

        System.assert(errorDetail1.equals(errorDetail2));
        System.assert(errorDetail2.equals(errorDetail1));
        System.assert(errorDetail1.equals(errorDetail1));
        System.assert(errorDetail3.equals(errorDetail4));
        System.assert(errorDetail4.equals(errorDetail3));
        System.assert(errorDetail3.equals(errorDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASErrorDetail errorDetail1 = OASErrorDetail.getExample();
        OASErrorDetail errorDetail2 = OASErrorDetail.getExample();
        OASErrorDetail errorDetail3 = new OASErrorDetail();
        OASErrorDetail errorDetail4 = new OASErrorDetail();

        System.assert(errorDetail1.equals(errorDetail2));
        System.assert(errorDetail2.equals(errorDetail1));
        System.assert(errorDetail3.equals(errorDetail4));
        System.assert(errorDetail4.equals(errorDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASErrorDetail errorDetail1 = OASErrorDetail.getExample();
        OASErrorDetail errorDetail2 = new OASErrorDetail();

        System.assertEquals(false, errorDetail1.equals('foo'));
        System.assertEquals(false, errorDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASErrorDetail errorDetail1 = OASErrorDetail.getExample();
        OASErrorDetail errorDetail2 = new OASErrorDetail();
        OASErrorDetail errorDetail3;

        System.assertEquals(false, errorDetail1.equals(errorDetail3));
        System.assertEquals(false, errorDetail2.equals(errorDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASErrorDetail errorDetail1 = OASErrorDetail.getExample();
        OASErrorDetail errorDetail2 = new OASErrorDetail();

        System.assertEquals(errorDetail1.hashCode(), errorDetail1.hashCode());
        System.assertEquals(errorDetail2.hashCode(), errorDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASErrorDetail errorDetail1 = OASErrorDetail.getExample();
        OASErrorDetail errorDetail2 = OASErrorDetail.getExample();
        OASErrorDetail errorDetail3 = new OASErrorDetail();
        OASErrorDetail errorDetail4 = new OASErrorDetail();

        System.assert(errorDetail1.equals(errorDetail2));
        System.assert(errorDetail3.equals(errorDetail4));
        System.assertEquals(errorDetail1.hashCode(), errorDetail2.hashCode());
        System.assertEquals(errorDetail3.hashCode(), errorDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASErrorDetail errorDetail = new OASErrorDetail();
        Map<String, String> x-property-mappings = errorDetail.getx-property-mappings();
        System.assertEquals('errorCode', x-property-mappings.get('error_code'));
    }
}
