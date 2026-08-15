//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LeadFormCommon {
  /// Returns a new [LeadFormCommon] instance.
  LeadFormCommon({
    this.completionMessage,
    this.disclosureLanguage,
    this.hasAcceptedTerms,
    this.name,
    this.policyLinks = const [],
    this.privacyPolicyLink,
    this.questions = const [],
    this.status,
  });

  /// A message for people who complete the form to let them know what happens next.
  String? completionMessage;

  /// Additional disclosure language to be included in the lead form.
  String? disclosureLanguage;

  /// Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? hasAcceptedTerms;

  /// Internal name of the lead form.
  String? name;

  /// List of additional policy links to be displayed on the lead form.
  List<LeadFormCommonPolicyLinksInner> policyLinks;

  /// A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
  String? privacyPolicyLink;

  /// List of questions to be displayed on the lead form.
  List<LeadFormQuestion> questions;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  LeadFormStatus? status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LeadFormCommon &&
    other.completionMessage == completionMessage &&
    other.disclosureLanguage == disclosureLanguage &&
    other.hasAcceptedTerms == hasAcceptedTerms &&
    other.name == name &&
    _deepEquality.equals(other.policyLinks, policyLinks) &&
    other.privacyPolicyLink == privacyPolicyLink &&
    _deepEquality.equals(other.questions, questions) &&
    other.status == status;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (completionMessage == null ? 0 : completionMessage!.hashCode) +
    (disclosureLanguage == null ? 0 : disclosureLanguage!.hashCode) +
    (hasAcceptedTerms == null ? 0 : hasAcceptedTerms!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (policyLinks.hashCode) +
    (privacyPolicyLink == null ? 0 : privacyPolicyLink!.hashCode) +
    (questions.hashCode) +
    (status == null ? 0 : status!.hashCode);

  @override
  String toString() => 'LeadFormCommon[completionMessage=$completionMessage, disclosureLanguage=$disclosureLanguage, hasAcceptedTerms=$hasAcceptedTerms, name=$name, policyLinks=$policyLinks, privacyPolicyLink=$privacyPolicyLink, questions=$questions, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.completionMessage != null) {
      json[r'completion_message'] = this.completionMessage;
    } else {
      json[r'completion_message'] = null;
    }
    if (this.disclosureLanguage != null) {
      json[r'disclosure_language'] = this.disclosureLanguage;
    } else {
      json[r'disclosure_language'] = null;
    }
    if (this.hasAcceptedTerms != null) {
      json[r'has_accepted_terms'] = this.hasAcceptedTerms;
    } else {
      json[r'has_accepted_terms'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
      json[r'policy_links'] = this.policyLinks;
    if (this.privacyPolicyLink != null) {
      json[r'privacy_policy_link'] = this.privacyPolicyLink;
    } else {
      json[r'privacy_policy_link'] = null;
    }
      json[r'questions'] = this.questions;
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    return json;
  }

  /// Returns a new [LeadFormCommon] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LeadFormCommon? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "LeadFormCommon[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "LeadFormCommon[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return LeadFormCommon(
        completionMessage: mapValueOfType<String>(json, r'completion_message'),
        disclosureLanguage: mapValueOfType<String>(json, r'disclosure_language'),
        hasAcceptedTerms: mapValueOfType<bool>(json, r'has_accepted_terms'),
        name: mapValueOfType<String>(json, r'name'),
        policyLinks: LeadFormCommonPolicyLinksInner.listFromJson(json[r'policy_links']),
        privacyPolicyLink: mapValueOfType<String>(json, r'privacy_policy_link'),
        questions: LeadFormQuestion.listFromJson(json[r'questions']),
        status: LeadFormStatus.fromJson(json[r'status']),
      );
    }
    return null;
  }

  static List<LeadFormCommon> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LeadFormCommon>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LeadFormCommon.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LeadFormCommon> mapFromJson(dynamic json) {
    final map = <String, LeadFormCommon>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LeadFormCommon.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LeadFormCommon-objects as value to a dart map
  static Map<String, List<LeadFormCommon>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LeadFormCommon>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LeadFormCommon.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

