@isTest
private class OASSSIOInsertionOrderCommonTest {
    @isTest
    private static void equalsSameInstance() {
        OASSSIOInsertionOrderCommon ssIOInsertionOrderCommon1 = OASSSIOInsertionOrderCommon.getExample();
        OASSSIOInsertionOrderCommon ssIOInsertionOrderCommon2 = ssIOInsertionOrderCommon1;
        OASSSIOInsertionOrderCommon ssIOInsertionOrderCommon3 = new OASSSIOInsertionOrderCommon();
        OASSSIOInsertionOrderCommon ssIOInsertionOrderCommon4 = ssIOInsertionOrderCommon3;

        System.assert(ssIOInsertionOrderCommon1.equals(ssIOInsertionOrderCommon2));
        System.assert(ssIOInsertionOrderCommon2.equals(ssIOInsertionOrderCommon1));
        System.assert(ssIOInsertionOrderCommon1.equals(ssIOInsertionOrderCommon1));
        System.assert(ssIOInsertionOrderCommon3.equals(ssIOInsertionOrderCommon4));
        System.assert(ssIOInsertionOrderCommon4.equals(ssIOInsertionOrderCommon3));
        System.assert(ssIOInsertionOrderCommon3.equals(ssIOInsertionOrderCommon3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSSIOInsertionOrderCommon ssIOInsertionOrderCommon1 = OASSSIOInsertionOrderCommon.getExample();
        OASSSIOInsertionOrderCommon ssIOInsertionOrderCommon2 = OASSSIOInsertionOrderCommon.getExample();
        OASSSIOInsertionOrderCommon ssIOInsertionOrderCommon3 = new OASSSIOInsertionOrderCommon();
        OASSSIOInsertionOrderCommon ssIOInsertionOrderCommon4 = new OASSSIOInsertionOrderCommon();

        System.assert(ssIOInsertionOrderCommon1.equals(ssIOInsertionOrderCommon2));
        System.assert(ssIOInsertionOrderCommon2.equals(ssIOInsertionOrderCommon1));
        System.assert(ssIOInsertionOrderCommon3.equals(ssIOInsertionOrderCommon4));
        System.assert(ssIOInsertionOrderCommon4.equals(ssIOInsertionOrderCommon3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSSIOInsertionOrderCommon ssIOInsertionOrderCommon1 = OASSSIOInsertionOrderCommon.getExample();
        OASSSIOInsertionOrderCommon ssIOInsertionOrderCommon2 = new OASSSIOInsertionOrderCommon();

        System.assertEquals(false, ssIOInsertionOrderCommon1.equals('foo'));
        System.assertEquals(false, ssIOInsertionOrderCommon2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSSIOInsertionOrderCommon ssIOInsertionOrderCommon1 = OASSSIOInsertionOrderCommon.getExample();
        OASSSIOInsertionOrderCommon ssIOInsertionOrderCommon2 = new OASSSIOInsertionOrderCommon();
        OASSSIOInsertionOrderCommon ssIOInsertionOrderCommon3;

        System.assertEquals(false, ssIOInsertionOrderCommon1.equals(ssIOInsertionOrderCommon3));
        System.assertEquals(false, ssIOInsertionOrderCommon2.equals(ssIOInsertionOrderCommon3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSSIOInsertionOrderCommon ssIOInsertionOrderCommon1 = OASSSIOInsertionOrderCommon.getExample();
        OASSSIOInsertionOrderCommon ssIOInsertionOrderCommon2 = new OASSSIOInsertionOrderCommon();

        System.assertEquals(ssIOInsertionOrderCommon1.hashCode(), ssIOInsertionOrderCommon1.hashCode());
        System.assertEquals(ssIOInsertionOrderCommon2.hashCode(), ssIOInsertionOrderCommon2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSSIOInsertionOrderCommon ssIOInsertionOrderCommon1 = OASSSIOInsertionOrderCommon.getExample();
        OASSSIOInsertionOrderCommon ssIOInsertionOrderCommon2 = OASSSIOInsertionOrderCommon.getExample();
        OASSSIOInsertionOrderCommon ssIOInsertionOrderCommon3 = new OASSSIOInsertionOrderCommon();
        OASSSIOInsertionOrderCommon ssIOInsertionOrderCommon4 = new OASSSIOInsertionOrderCommon();

        System.assert(ssIOInsertionOrderCommon1.equals(ssIOInsertionOrderCommon2));
        System.assert(ssIOInsertionOrderCommon3.equals(ssIOInsertionOrderCommon4));
        System.assertEquals(ssIOInsertionOrderCommon1.hashCode(), ssIOInsertionOrderCommon2.hashCode());
        System.assertEquals(ssIOInsertionOrderCommon3.hashCode(), ssIOInsertionOrderCommon4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSSIOInsertionOrderCommon ssIOInsertionOrderCommon = new OASSSIOInsertionOrderCommon();
        Map<String, String> x-property-mappings = ssIOInsertionOrderCommon.getx-property-mappings();
        System.assertEquals('startDate', x-property-mappings.get('start_date'));
        System.assertEquals('endDate', x-property-mappings.get('end_date'));
        System.assertEquals('poNumber', x-property-mappings.get('po_number'));
        System.assertEquals('budgetAmount', x-property-mappings.get('budget_amount'));
        System.assertEquals('billingContactFirstname', x-property-mappings.get('billing_contact_firstname'));
        System.assertEquals('billingContactLastname', x-property-mappings.get('billing_contact_lastname'));
        System.assertEquals('billingContactEmail', x-property-mappings.get('billing_contact_email'));
        System.assertEquals('mediaContactFirstname', x-property-mappings.get('media_contact_firstname'));
        System.assertEquals('mediaContactLastname', x-property-mappings.get('media_contact_lastname'));
        System.assertEquals('mediaContactEmail', x-property-mappings.get('media_contact_email'));
        System.assertEquals('agencyLink', x-property-mappings.get('agency_link'));
        System.assertEquals('userEmail', x-property-mappings.get('user_email'));
    }
}
