@isTest
private class OASLeadFormUpdateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASLeadFormUpdateRequest leadFormUpdateRequest1 = OASLeadFormUpdateRequest.getExample();
        OASLeadFormUpdateRequest leadFormUpdateRequest2 = leadFormUpdateRequest1;
        OASLeadFormUpdateRequest leadFormUpdateRequest3 = new OASLeadFormUpdateRequest();
        OASLeadFormUpdateRequest leadFormUpdateRequest4 = leadFormUpdateRequest3;

        System.assert(leadFormUpdateRequest1.equals(leadFormUpdateRequest2));
        System.assert(leadFormUpdateRequest2.equals(leadFormUpdateRequest1));
        System.assert(leadFormUpdateRequest1.equals(leadFormUpdateRequest1));
        System.assert(leadFormUpdateRequest3.equals(leadFormUpdateRequest4));
        System.assert(leadFormUpdateRequest4.equals(leadFormUpdateRequest3));
        System.assert(leadFormUpdateRequest3.equals(leadFormUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLeadFormUpdateRequest leadFormUpdateRequest1 = OASLeadFormUpdateRequest.getExample();
        OASLeadFormUpdateRequest leadFormUpdateRequest2 = OASLeadFormUpdateRequest.getExample();
        OASLeadFormUpdateRequest leadFormUpdateRequest3 = new OASLeadFormUpdateRequest();
        OASLeadFormUpdateRequest leadFormUpdateRequest4 = new OASLeadFormUpdateRequest();

        System.assert(leadFormUpdateRequest1.equals(leadFormUpdateRequest2));
        System.assert(leadFormUpdateRequest2.equals(leadFormUpdateRequest1));
        System.assert(leadFormUpdateRequest3.equals(leadFormUpdateRequest4));
        System.assert(leadFormUpdateRequest4.equals(leadFormUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLeadFormUpdateRequest leadFormUpdateRequest1 = OASLeadFormUpdateRequest.getExample();
        OASLeadFormUpdateRequest leadFormUpdateRequest2 = new OASLeadFormUpdateRequest();

        System.assertEquals(false, leadFormUpdateRequest1.equals('foo'));
        System.assertEquals(false, leadFormUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLeadFormUpdateRequest leadFormUpdateRequest1 = OASLeadFormUpdateRequest.getExample();
        OASLeadFormUpdateRequest leadFormUpdateRequest2 = new OASLeadFormUpdateRequest();
        OASLeadFormUpdateRequest leadFormUpdateRequest3;

        System.assertEquals(false, leadFormUpdateRequest1.equals(leadFormUpdateRequest3));
        System.assertEquals(false, leadFormUpdateRequest2.equals(leadFormUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLeadFormUpdateRequest leadFormUpdateRequest1 = OASLeadFormUpdateRequest.getExample();
        OASLeadFormUpdateRequest leadFormUpdateRequest2 = new OASLeadFormUpdateRequest();

        System.assertEquals(leadFormUpdateRequest1.hashCode(), leadFormUpdateRequest1.hashCode());
        System.assertEquals(leadFormUpdateRequest2.hashCode(), leadFormUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLeadFormUpdateRequest leadFormUpdateRequest1 = OASLeadFormUpdateRequest.getExample();
        OASLeadFormUpdateRequest leadFormUpdateRequest2 = OASLeadFormUpdateRequest.getExample();
        OASLeadFormUpdateRequest leadFormUpdateRequest3 = new OASLeadFormUpdateRequest();
        OASLeadFormUpdateRequest leadFormUpdateRequest4 = new OASLeadFormUpdateRequest();

        System.assert(leadFormUpdateRequest1.equals(leadFormUpdateRequest2));
        System.assert(leadFormUpdateRequest3.equals(leadFormUpdateRequest4));
        System.assertEquals(leadFormUpdateRequest1.hashCode(), leadFormUpdateRequest2.hashCode());
        System.assertEquals(leadFormUpdateRequest3.hashCode(), leadFormUpdateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLeadFormUpdateRequest leadFormUpdateRequest = new OASLeadFormUpdateRequest();
        Map<String, String> x-property-mappings = leadFormUpdateRequest.getx-property-mappings();
        System.assertEquals('privacyPolicyLink', x-property-mappings.get('privacy_policy_link'));
        System.assertEquals('hasAcceptedTerms', x-property-mappings.get('has_accepted_terms'));
        System.assertEquals('completionMessage', x-property-mappings.get('completion_message'));
        System.assertEquals('disclosureLanguage', x-property-mappings.get('disclosure_language'));
        System.assertEquals('policyLinks', x-property-mappings.get('policy_links'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLeadFormUpdateRequest leadFormUpdateRequest = new OASLeadFormUpdateRequest();
        System.assertEquals(new List<OASLeadFormQuestion>(), leadFormUpdateRequest.questions);
        System.assertEquals(new List<OASLeadFormCommonPolicyLinksInner>(), leadFormUpdateRequest.policyLinks);
        System.assertEquals(null, leadFormUpdateRequest.name);
        System.assertEquals(null, leadFormUpdateRequest.privacyPolicyLink);
        System.assertEquals(null, leadFormUpdateRequest.hasAcceptedTerms);
        System.assertEquals(null, leadFormUpdateRequest.completionMessage);
        System.assertEquals(null, leadFormUpdateRequest.status);
        System.assertEquals(null, leadFormUpdateRequest.disclosureLanguage);
        System.assertEquals(null, leadFormUpdateRequest.id);
    }
}
