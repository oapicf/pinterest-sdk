@isTest
private class OASLeadFormCommonTest {
    @isTest
    private static void equalsSameInstance() {
        OASLeadFormCommon leadFormCommon1 = OASLeadFormCommon.getExample();
        OASLeadFormCommon leadFormCommon2 = leadFormCommon1;
        OASLeadFormCommon leadFormCommon3 = new OASLeadFormCommon();
        OASLeadFormCommon leadFormCommon4 = leadFormCommon3;

        System.assert(leadFormCommon1.equals(leadFormCommon2));
        System.assert(leadFormCommon2.equals(leadFormCommon1));
        System.assert(leadFormCommon1.equals(leadFormCommon1));
        System.assert(leadFormCommon3.equals(leadFormCommon4));
        System.assert(leadFormCommon4.equals(leadFormCommon3));
        System.assert(leadFormCommon3.equals(leadFormCommon3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLeadFormCommon leadFormCommon1 = OASLeadFormCommon.getExample();
        OASLeadFormCommon leadFormCommon2 = OASLeadFormCommon.getExample();
        OASLeadFormCommon leadFormCommon3 = new OASLeadFormCommon();
        OASLeadFormCommon leadFormCommon4 = new OASLeadFormCommon();

        System.assert(leadFormCommon1.equals(leadFormCommon2));
        System.assert(leadFormCommon2.equals(leadFormCommon1));
        System.assert(leadFormCommon3.equals(leadFormCommon4));
        System.assert(leadFormCommon4.equals(leadFormCommon3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLeadFormCommon leadFormCommon1 = OASLeadFormCommon.getExample();
        OASLeadFormCommon leadFormCommon2 = new OASLeadFormCommon();

        System.assertEquals(false, leadFormCommon1.equals('foo'));
        System.assertEquals(false, leadFormCommon2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLeadFormCommon leadFormCommon1 = OASLeadFormCommon.getExample();
        OASLeadFormCommon leadFormCommon2 = new OASLeadFormCommon();
        OASLeadFormCommon leadFormCommon3;

        System.assertEquals(false, leadFormCommon1.equals(leadFormCommon3));
        System.assertEquals(false, leadFormCommon2.equals(leadFormCommon3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLeadFormCommon leadFormCommon1 = OASLeadFormCommon.getExample();
        OASLeadFormCommon leadFormCommon2 = new OASLeadFormCommon();

        System.assertEquals(leadFormCommon1.hashCode(), leadFormCommon1.hashCode());
        System.assertEquals(leadFormCommon2.hashCode(), leadFormCommon2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLeadFormCommon leadFormCommon1 = OASLeadFormCommon.getExample();
        OASLeadFormCommon leadFormCommon2 = OASLeadFormCommon.getExample();
        OASLeadFormCommon leadFormCommon3 = new OASLeadFormCommon();
        OASLeadFormCommon leadFormCommon4 = new OASLeadFormCommon();

        System.assert(leadFormCommon1.equals(leadFormCommon2));
        System.assert(leadFormCommon3.equals(leadFormCommon4));
        System.assertEquals(leadFormCommon1.hashCode(), leadFormCommon2.hashCode());
        System.assertEquals(leadFormCommon3.hashCode(), leadFormCommon4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLeadFormCommon leadFormCommon = new OASLeadFormCommon();
        Map<String, String> x-property-mappings = leadFormCommon.getx-property-mappings();
        System.assertEquals('privacyPolicyLink', x-property-mappings.get('privacy_policy_link'));
        System.assertEquals('hasAcceptedTerms', x-property-mappings.get('has_accepted_terms'));
        System.assertEquals('completionMessage', x-property-mappings.get('completion_message'));
        System.assertEquals('disclosureLanguage', x-property-mappings.get('disclosure_language'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLeadFormCommon leadFormCommon = new OASLeadFormCommon();
        System.assertEquals(new List<OASLeadFormQuestion>(), leadFormCommon.questions);
        System.assertEquals(null, leadFormCommon.name);
        System.assertEquals(null, leadFormCommon.privacyPolicyLink);
        System.assertEquals(null, leadFormCommon.hasAcceptedTerms);
        System.assertEquals(null, leadFormCommon.completionMessage);
        System.assertEquals(null, leadFormCommon.status);
        System.assertEquals(null, leadFormCommon.disclosureLanguage);
    }
}
