//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdAccountsAudienceCreate {
  /// Returns a new [AdAccountsAudienceCreate] instance.
  AdAccountsAudienceCreate({
    this.adAccountId,
    this.audienceType,
    this.description,
    this.name,
    this.rule,
  });

  /// Ad account ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adAccountId;

  /// [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AudienceType? audienceType;

  /// Audience description.
  String? description;

  /// Audience name.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AdAccountsAudienceRule? rule;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdAccountsAudienceCreate &&
    other.adAccountId == adAccountId &&
    other.audienceType == audienceType &&
    other.description == description &&
    other.name == name &&
    other.rule == rule;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (audienceType == null ? 0 : audienceType!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (rule == null ? 0 : rule!.hashCode);

  @override
  String toString() => 'AdAccountsAudienceCreate[adAccountId=$adAccountId, audienceType=$audienceType, description=$description, name=$name, rule=$rule]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adAccountId != null) {
      json[r'ad_account_id'] = this.adAccountId;
    } else {
      json[r'ad_account_id'] = null;
    }
    if (this.audienceType != null) {
      json[r'audience_type'] = this.audienceType;
    } else {
      json[r'audience_type'] = null;
    }
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.rule != null) {
      json[r'rule'] = this.rule;
    } else {
      json[r'rule'] = null;
    }
    return json;
  }

  /// Returns a new [AdAccountsAudienceCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdAccountsAudienceCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return AdAccountsAudienceCreate(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        audienceType: AudienceType.fromJson(json[r'audience_type']),
        description: mapValueOfType<String>(json, r'description'),
        name: mapValueOfType<String>(json, r'name'),
        rule: AdAccountsAudienceRule.fromJson(json[r'rule']),
      );
    }
    return null;
  }

  static List<AdAccountsAudienceCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdAccountsAudienceCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdAccountsAudienceCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdAccountsAudienceCreate> mapFromJson(dynamic json) {
    final map = <String, AdAccountsAudienceCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdAccountsAudienceCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdAccountsAudienceCreate-objects as value to a dart map
  static Map<String, List<AdAccountsAudienceCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdAccountsAudienceCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdAccountsAudienceCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

