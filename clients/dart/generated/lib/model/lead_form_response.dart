//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LeadFormResponse {
  /// Returns a new [LeadFormResponse] instance.
  LeadFormResponse({
    this.completionMessage,
    this.disclosureLanguage,
    this.hasAcceptedTerms,
    this.name,
    this.policyLinks = const [],
    this.privacyPolicyLink,
    this.questions = const [],
    this.status,
    this.adAccountId,
    this.createdTime,
    this.id,
    this.updatedTime,
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

  /// The Ad Account ID that this lead form belongs to.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adAccountId;

  /// Lead form creation time. Unix timestamp in seconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? createdTime;

  /// The ID of this lead form
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// Last update time. Unix timestamp in seconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? updatedTime;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LeadFormResponse &&
    other.completionMessage == completionMessage &&
    other.disclosureLanguage == disclosureLanguage &&
    other.hasAcceptedTerms == hasAcceptedTerms &&
    other.name == name &&
    _deepEquality.equals(other.policyLinks, policyLinks) &&
    other.privacyPolicyLink == privacyPolicyLink &&
    _deepEquality.equals(other.questions, questions) &&
    other.status == status &&
    other.adAccountId == adAccountId &&
    other.createdTime == createdTime &&
    other.id == id &&
    other.updatedTime == updatedTime;

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
    (status == null ? 0 : status!.hashCode) +
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (createdTime == null ? 0 : createdTime!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (updatedTime == null ? 0 : updatedTime!.hashCode);

  @override
  String toString() => 'LeadFormResponse[completionMessage=$completionMessage, disclosureLanguage=$disclosureLanguage, hasAcceptedTerms=$hasAcceptedTerms, name=$name, policyLinks=$policyLinks, privacyPolicyLink=$privacyPolicyLink, questions=$questions, status=$status, adAccountId=$adAccountId, createdTime=$createdTime, id=$id, updatedTime=$updatedTime]';

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
    if (this.adAccountId != null) {
      json[r'ad_account_id'] = this.adAccountId;
    } else {
      json[r'ad_account_id'] = null;
    }
    if (this.createdTime != null) {
      json[r'created_time'] = this.createdTime;
    } else {
      json[r'created_time'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.updatedTime != null) {
      json[r'updated_time'] = this.updatedTime;
    } else {
      json[r'updated_time'] = null;
    }
    return json;
  }

  /// Returns a new [LeadFormResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LeadFormResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "LeadFormResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "LeadFormResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return LeadFormResponse(
        completionMessage: mapValueOfType<String>(json, r'completion_message'),
        disclosureLanguage: mapValueOfType<String>(json, r'disclosure_language'),
        hasAcceptedTerms: mapValueOfType<bool>(json, r'has_accepted_terms'),
        name: mapValueOfType<String>(json, r'name'),
        policyLinks: LeadFormCommonPolicyLinksInner.listFromJson(json[r'policy_links']),
        privacyPolicyLink: mapValueOfType<String>(json, r'privacy_policy_link'),
        questions: LeadFormQuestion.listFromJson(json[r'questions']),
        status: LeadFormStatus.fromJson(json[r'status']),
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        createdTime: mapValueOfType<int>(json, r'created_time'),
        id: mapValueOfType<String>(json, r'id'),
        updatedTime: mapValueOfType<int>(json, r'updated_time'),
      );
    }
    return null;
  }

  static List<LeadFormResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LeadFormResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LeadFormResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LeadFormResponse> mapFromJson(dynamic json) {
    final map = <String, LeadFormResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LeadFormResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LeadFormResponse-objects as value to a dart map
  static Map<String, List<LeadFormResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LeadFormResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LeadFormResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

