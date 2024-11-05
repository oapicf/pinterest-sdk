@isTest
private class OASUpdatePartnerResultsResponseArrayTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdatePartnerResultsResponseArray updatePartnerResultsResponseArrayItemsInner1 = OASUpdatePartnerResultsResponseArray.getExample();
        OASUpdatePartnerResultsResponseArray updatePartnerResultsResponseArrayItemsInner2 = updatePartnerResultsResponseArrayItemsInner1;
        OASUpdatePartnerResultsResponseArray updatePartnerResultsResponseArrayItemsInner3 = new OASUpdatePartnerResultsResponseArray();
        OASUpdatePartnerResultsResponseArray updatePartnerResultsResponseArrayItemsInner4 = updatePartnerResultsResponseArrayItemsInner3;

        System.assert(updatePartnerResultsResponseArrayItemsInner1.equals(updatePartnerResultsResponseArrayItemsInner2));
        System.assert(updatePartnerResultsResponseArrayItemsInner2.equals(updatePartnerResultsResponseArrayItemsInner1));
        System.assert(updatePartnerResultsResponseArrayItemsInner1.equals(updatePartnerResultsResponseArrayItemsInner1));
        System.assert(updatePartnerResultsResponseArrayItemsInner3.equals(updatePartnerResultsResponseArrayItemsInner4));
        System.assert(updatePartnerResultsResponseArrayItemsInner4.equals(updatePartnerResultsResponseArrayItemsInner3));
        System.assert(updatePartnerResultsResponseArrayItemsInner3.equals(updatePartnerResultsResponseArrayItemsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdatePartnerResultsResponseArray updatePartnerResultsResponseArrayItemsInner1 = OASUpdatePartnerResultsResponseArray.getExample();
        OASUpdatePartnerResultsResponseArray updatePartnerResultsResponseArrayItemsInner2 = OASUpdatePartnerResultsResponseArray.getExample();
        OASUpdatePartnerResultsResponseArray updatePartnerResultsResponseArrayItemsInner3 = new OASUpdatePartnerResultsResponseArray();
        OASUpdatePartnerResultsResponseArray updatePartnerResultsResponseArrayItemsInner4 = new OASUpdatePartnerResultsResponseArray();

        System.assert(updatePartnerResultsResponseArrayItemsInner1.equals(updatePartnerResultsResponseArrayItemsInner2));
        System.assert(updatePartnerResultsResponseArrayItemsInner2.equals(updatePartnerResultsResponseArrayItemsInner1));
        System.assert(updatePartnerResultsResponseArrayItemsInner3.equals(updatePartnerResultsResponseArrayItemsInner4));
        System.assert(updatePartnerResultsResponseArrayItemsInner4.equals(updatePartnerResultsResponseArrayItemsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdatePartnerResultsResponseArray updatePartnerResultsResponseArrayItemsInner1 = OASUpdatePartnerResultsResponseArray.getExample();
        OASUpdatePartnerResultsResponseArray updatePartnerResultsResponseArrayItemsInner2 = new OASUpdatePartnerResultsResponseArray();

        System.assertEquals(false, updatePartnerResultsResponseArrayItemsInner1.equals('foo'));
        System.assertEquals(false, updatePartnerResultsResponseArrayItemsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdatePartnerResultsResponseArray updatePartnerResultsResponseArrayItemsInner1 = OASUpdatePartnerResultsResponseArray.getExample();
        OASUpdatePartnerResultsResponseArray updatePartnerResultsResponseArrayItemsInner2 = new OASUpdatePartnerResultsResponseArray();
        OASUpdatePartnerResultsResponseArray updatePartnerResultsResponseArrayItemsInner3;

        System.assertEquals(false, updatePartnerResultsResponseArrayItemsInner1.equals(updatePartnerResultsResponseArrayItemsInner3));
        System.assertEquals(false, updatePartnerResultsResponseArrayItemsInner2.equals(updatePartnerResultsResponseArrayItemsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdatePartnerResultsResponseArray updatePartnerResultsResponseArrayItemsInner1 = OASUpdatePartnerResultsResponseArray.getExample();
        OASUpdatePartnerResultsResponseArray updatePartnerResultsResponseArrayItemsInner2 = new OASUpdatePartnerResultsResponseArray();

        System.assertEquals(updatePartnerResultsResponseArrayItemsInner1.hashCode(), updatePartnerResultsResponseArrayItemsInner1.hashCode());
        System.assertEquals(updatePartnerResultsResponseArrayItemsInner2.hashCode(), updatePartnerResultsResponseArrayItemsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdatePartnerResultsResponseArray updatePartnerResultsResponseArrayItemsInner1 = OASUpdatePartnerResultsResponseArray.getExample();
        OASUpdatePartnerResultsResponseArray updatePartnerResultsResponseArrayItemsInner2 = OASUpdatePartnerResultsResponseArray.getExample();
        OASUpdatePartnerResultsResponseArray updatePartnerResultsResponseArrayItemsInner3 = new OASUpdatePartnerResultsResponseArray();
        OASUpdatePartnerResultsResponseArray updatePartnerResultsResponseArrayItemsInner4 = new OASUpdatePartnerResultsResponseArray();

        System.assert(updatePartnerResultsResponseArrayItemsInner1.equals(updatePartnerResultsResponseArrayItemsInner2));
        System.assert(updatePartnerResultsResponseArrayItemsInner3.equals(updatePartnerResultsResponseArrayItemsInner4));
        System.assertEquals(updatePartnerResultsResponseArrayItemsInner1.hashCode(), updatePartnerResultsResponseArrayItemsInner2.hashCode());
        System.assertEquals(updatePartnerResultsResponseArrayItemsInner3.hashCode(), updatePartnerResultsResponseArrayItemsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUpdatePartnerResultsResponseArray updatePartnerResultsResponseArrayItemsInner = new OASUpdatePartnerResultsResponseArray();
        Map<String, String> x-property-mappings = updatePartnerResultsResponseArrayItemsInner.getx-property-mappings();
        System.assertEquals('r_exception', x-property-mappings.get('exception'));
        System.assertEquals('memberOrPartnerId', x-property-mappings.get('member_or_partner_id'));
    }
}
