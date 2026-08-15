//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AudienceUpdateRequest {
  /// Returns a new [AudienceUpdateRequest] instance.
  AudienceUpdateRequest({
    this.adAccountId,
    this.name,
    this.rule,
    this.description,
    this.operationType,
  });

  /// Ad account ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adAccountId;

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

  /// Audience description.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? description;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AudienceUpdateOperationType? operationType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AudienceUpdateRequest &&
    other.adAccountId == adAccountId &&
    other.name == name &&
    other.rule == rule &&
    other.description == description &&
    other.operationType == operationType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (rule == null ? 0 : rule!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (operationType == null ? 0 : operationType!.hashCode);

  @override
  String toString() => 'AudienceUpdateRequest[adAccountId=$adAccountId, name=$name, rule=$rule, description=$description, operationType=$operationType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adAccountId != null) {
      json[r'ad_account_id'] = this.adAccountId;
    } else {
      json[r'ad_account_id'] = null;
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
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    if (this.operationType != null) {
      json[r'operation_type'] = this.operationType;
    } else {
      json[r'operation_type'] = null;
    }
    return json;
  }

  /// Returns a new [AudienceUpdateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AudienceUpdateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AudienceUpdateRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AudienceUpdateRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AudienceUpdateRequest(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        name: mapValueOfType<String>(json, r'name'),
        rule: AudienceRule.fromJson(json[r'rule']),
        description: mapValueOfType<String>(json, r'description'),
        operationType: AudienceUpdateOperationType.fromJson(json[r'operation_type']),
      );
    }
    return null;
  }

  static List<AudienceUpdateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AudienceUpdateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AudienceUpdateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AudienceUpdateRequest> mapFromJson(dynamic json) {
    final map = <String, AudienceUpdateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AudienceUpdateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AudienceUpdateRequest-objects as value to a dart map
  static Map<String, List<AudienceUpdateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AudienceUpdateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AudienceUpdateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

