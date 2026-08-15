//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Audience {
  /// Returns a new [Audience] instance.
  Audience({
    this.adAccountId,
    this.audienceType,
    this.createdByCompanyName,
    this.createdTimestamp,
    this.description,
    this.id,
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

  /// <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? audienceType;

  /// The company that created this audience.
  String? createdByCompanyName;

  /// Creation time. Unix timestamp in seconds.
  int? createdTimestamp;

  /// Audience description.
  String? description;

  /// Audience ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

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
  AudienceRule? rule;

  /// Audience size.
  int? size;

  /// Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? status;

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
  bool operator ==(Object other) => identical(this, other) || other is Audience &&
    other.adAccountId == adAccountId &&
    other.audienceType == audienceType &&
    other.createdByCompanyName == createdByCompanyName &&
    other.createdTimestamp == createdTimestamp &&
    other.description == description &&
    other.id == id &&
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
    (id == null ? 0 : id!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (rule == null ? 0 : rule!.hashCode) +
    (size == null ? 0 : size!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (type == null ? 0 : type!.hashCode) +
    (updatedTimestamp == null ? 0 : updatedTimestamp!.hashCode);

  @override
  String toString() => 'Audience[adAccountId=$adAccountId, audienceType=$audienceType, createdByCompanyName=$createdByCompanyName, createdTimestamp=$createdTimestamp, description=$description, id=$id, name=$name, rule=$rule, size=$size, status=$status, type=$type, updatedTimestamp=$updatedTimestamp]';

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
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
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

  /// Returns a new [Audience] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Audience? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "Audience[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "Audience[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return Audience(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        audienceType: mapValueOfType<String>(json, r'audience_type'),
        createdByCompanyName: mapValueOfType<String>(json, r'created_by_company_name'),
        createdTimestamp: mapValueOfType<int>(json, r'created_timestamp'),
        description: mapValueOfType<String>(json, r'description'),
        id: mapValueOfType<String>(json, r'id'),
        name: mapValueOfType<String>(json, r'name'),
        rule: AudienceRule.fromJson(json[r'rule']),
        size: mapValueOfType<int>(json, r'size'),
        status: mapValueOfType<String>(json, r'status'),
        type: mapValueOfType<String>(json, r'type'),
        updatedTimestamp: mapValueOfType<int>(json, r'updated_timestamp'),
      );
    }
    return null;
  }

  static List<Audience> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Audience>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Audience.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Audience> mapFromJson(dynamic json) {
    final map = <String, Audience>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Audience.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Audience-objects as value to a dart map
  static Map<String, List<Audience>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Audience>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Audience.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

