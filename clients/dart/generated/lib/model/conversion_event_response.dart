//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionEventResponse {
  /// Returns a new [ConversionEventResponse] instance.
  ConversionEventResponse({
    this.adAccountId,
    this.conversionEvent,
    this.conversionTagId,
    this.createdTime,
  });

  /// Id of the ad account.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adAccountId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConversionTagType? conversionEvent;

  /// Id of the tag.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? conversionTagId;

  /// Creation date in epoch format.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? createdTime;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionEventResponse &&
    other.adAccountId == adAccountId &&
    other.conversionEvent == conversionEvent &&
    other.conversionTagId == conversionTagId &&
    other.createdTime == createdTime;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (conversionEvent == null ? 0 : conversionEvent!.hashCode) +
    (conversionTagId == null ? 0 : conversionTagId!.hashCode) +
    (createdTime == null ? 0 : createdTime!.hashCode);

  @override
  String toString() => 'ConversionEventResponse[adAccountId=$adAccountId, conversionEvent=$conversionEvent, conversionTagId=$conversionTagId, createdTime=$createdTime]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adAccountId != null) {
      json[r'ad_account_id'] = this.adAccountId;
    } else {
      json[r'ad_account_id'] = null;
    }
    if (this.conversionEvent != null) {
      json[r'conversion_event'] = this.conversionEvent;
    } else {
      json[r'conversion_event'] = null;
    }
    if (this.conversionTagId != null) {
      json[r'conversion_tag_id'] = this.conversionTagId;
    } else {
      json[r'conversion_tag_id'] = null;
    }
    if (this.createdTime != null) {
      json[r'created_time'] = this.createdTime;
    } else {
      json[r'created_time'] = null;
    }
    return json;
  }

  /// Returns a new [ConversionEventResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionEventResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ConversionEventResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ConversionEventResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ConversionEventResponse(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        conversionEvent: ConversionTagType.fromJson(json[r'conversion_event']),
        conversionTagId: mapValueOfType<String>(json, r'conversion_tag_id'),
        createdTime: mapValueOfType<int>(json, r'created_time'),
      );
    }
    return null;
  }

  static List<ConversionEventResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionEventResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionEventResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionEventResponse> mapFromJson(dynamic json) {
    final map = <String, ConversionEventResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionEventResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionEventResponse-objects as value to a dart map
  static Map<String, List<ConversionEventResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionEventResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionEventResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

