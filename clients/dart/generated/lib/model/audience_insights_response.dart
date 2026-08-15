//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AudienceInsightsResponse {
  /// Returns a new [AudienceInsightsResponse] instance.
  AudienceInsightsResponse({
    this.categories = const [],
    this.date,
    this.demographics,
    this.size,
    this.sizeIsUpperBound,
    this.type,
  });

  /// Category interest distribution
  List<AudienceCategory> categories;

  /// Generation date
  String? date;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AudienceDemographics? demographics;

  /// Population count.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? size;

  /// Indicates whether the audience size has been rounded up to the next highest upper boundary.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? sizeIsUpperBound;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AudienceInsightType? type;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AudienceInsightsResponse &&
    _deepEquality.equals(other.categories, categories) &&
    other.date == date &&
    other.demographics == demographics &&
    other.size == size &&
    other.sizeIsUpperBound == sizeIsUpperBound &&
    other.type == type;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (categories.hashCode) +
    (date == null ? 0 : date!.hashCode) +
    (demographics == null ? 0 : demographics!.hashCode) +
    (size == null ? 0 : size!.hashCode) +
    (sizeIsUpperBound == null ? 0 : sizeIsUpperBound!.hashCode) +
    (type == null ? 0 : type!.hashCode);

  @override
  String toString() => 'AudienceInsightsResponse[categories=$categories, date=$date, demographics=$demographics, size=$size, sizeIsUpperBound=$sizeIsUpperBound, type=$type]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'categories'] = this.categories;
    if (this.date != null) {
      json[r'date'] = this.date;
    } else {
      json[r'date'] = null;
    }
    if (this.demographics != null) {
      json[r'demographics'] = this.demographics;
    } else {
      json[r'demographics'] = null;
    }
    if (this.size != null) {
      json[r'size'] = this.size;
    } else {
      json[r'size'] = null;
    }
    if (this.sizeIsUpperBound != null) {
      json[r'size_is_upper_bound'] = this.sizeIsUpperBound;
    } else {
      json[r'size_is_upper_bound'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    return json;
  }

  /// Returns a new [AudienceInsightsResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AudienceInsightsResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AudienceInsightsResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AudienceInsightsResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AudienceInsightsResponse(
        categories: AudienceCategory.listFromJson(json[r'categories']),
        date: mapValueOfType<String>(json, r'date'),
        demographics: AudienceDemographics.fromJson(json[r'demographics']),
        size: mapValueOfType<int>(json, r'size'),
        sizeIsUpperBound: mapValueOfType<bool>(json, r'size_is_upper_bound'),
        type: AudienceInsightType.fromJson(json[r'type']),
      );
    }
    return null;
  }

  static List<AudienceInsightsResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AudienceInsightsResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AudienceInsightsResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AudienceInsightsResponse> mapFromJson(dynamic json) {
    final map = <String, AudienceInsightsResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AudienceInsightsResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AudienceInsightsResponse-objects as value to a dart map
  static Map<String, List<AudienceInsightsResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AudienceInsightsResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AudienceInsightsResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

