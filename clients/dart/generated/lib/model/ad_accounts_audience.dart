//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdAccountsAudience {
  /// Returns a new [AdAccountsAudience] instance.
  AdAccountsAudience({
    this.adAccountId,
    this.audienceType,
    this.createdByCompanyName,
    this.createdTimestamp,
    this.description,
    required this.id,
    this.isNca,
    this.name,
    this.rule,
    this.size,
    this.status,
    this.type,
    this.updatedTimestamp,
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

  /// The company that created this audience.
  String? createdByCompanyName;

  /// Creation time. Unix timestamp in seconds.
  int? createdTimestamp;

  /// Audience description.
  String? description;

  /// Audience ID.
  String id;

  /// Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isNca;

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

  /// Audience size.
  int? size;

  /// Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AudienceStatus? status;

  /// Always \"audience\".
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? type;

  /// Last update time. Unix timestamp in seconds.
  int? updatedTimestamp;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdAccountsAudience &&
    other.adAccountId == adAccountId &&
    other.audienceType == audienceType &&
    other.createdByCompanyName == createdByCompanyName &&
    other.createdTimestamp == createdTimestamp &&
    other.description == description &&
    other.id == id &&
    other.isNca == isNca &&
    other.name == name &&
    other.rule == rule &&
    other.size == size &&
    other.status == status &&
    other.type == type &&
    other.updatedTimestamp == updatedTimestamp;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (audienceType == null ? 0 : audienceType!.hashCode) +
    (createdByCompanyName == null ? 0 : createdByCompanyName!.hashCode) +
    (createdTimestamp == null ? 0 : createdTimestamp!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (id.hashCode) +
    (isNca == null ? 0 : isNca!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (rule == null ? 0 : rule!.hashCode) +
    (size == null ? 0 : size!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (type == null ? 0 : type!.hashCode) +
    (updatedTimestamp == null ? 0 : updatedTimestamp!.hashCode);

  @override
  String toString() => 'AdAccountsAudience[adAccountId=$adAccountId, audienceType=$audienceType, createdByCompanyName=$createdByCompanyName, createdTimestamp=$createdTimestamp, description=$description, id=$id, isNca=$isNca, name=$name, rule=$rule, size=$size, status=$status, type=$type, updatedTimestamp=$updatedTimestamp]';

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
    if (this.createdByCompanyName != null) {
      json[r'created_by_company_name'] = this.createdByCompanyName;
    } else {
      json[r'created_by_company_name'] = null;
    }
    if (this.createdTimestamp != null) {
      json[r'created_timestamp'] = this.createdTimestamp;
    } else {
      json[r'created_timestamp'] = null;
    }
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
      json[r'id'] = this.id;
    if (this.isNca != null) {
      json[r'is_nca'] = this.isNca;
    } else {
      json[r'is_nca'] = null;
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
    if (this.size != null) {
      json[r'size'] = this.size;
    } else {
      json[r'size'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.updatedTimestamp != null) {
      json[r'updated_timestamp'] = this.updatedTimestamp;
    } else {
      json[r'updated_timestamp'] = null;
    }
    return json;
  }

  /// Returns a new [AdAccountsAudience] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdAccountsAudience? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "AdAccountsAudience[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "AdAccountsAudience[id]" has a null value in JSON.');
        return true;
      }());

      return AdAccountsAudience(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        audienceType: AudienceType.fromJson(json[r'audience_type']),
        createdByCompanyName: mapValueOfType<String>(json, r'created_by_company_name'),
        createdTimestamp: mapValueOfType<int>(json, r'created_timestamp'),
        description: mapValueOfType<String>(json, r'description'),
        id: mapValueOfType<String>(json, r'id')!,
        isNca: mapValueOfType<bool>(json, r'is_nca'),
        name: mapValueOfType<String>(json, r'name'),
        rule: AdAccountsAudienceRule.fromJson(json[r'rule']),
        size: mapValueOfType<int>(json, r'size'),
        status: AudienceStatus.fromJson(json[r'status']),
        type: mapValueOfType<String>(json, r'type'),
        updatedTimestamp: mapValueOfType<int>(json, r'updated_timestamp'),
      );
    }
    return null;
  }

  static List<AdAccountsAudience> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdAccountsAudience>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdAccountsAudience.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdAccountsAudience> mapFromJson(dynamic json) {
    final map = <String, AdAccountsAudience>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdAccountsAudience.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdAccountsAudience-objects as value to a dart map
  static Map<String, List<AdAccountsAudience>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdAccountsAudience>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdAccountsAudience.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
  };
}

