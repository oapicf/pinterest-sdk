//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class QuizPinResult {
  /// Returns a new [QuizPinResult] instance.
  QuizPinResult({
    this.androidDeepLink,
    this.destinationUrl,
    this.iosDeepLink,
    this.organicPinId,
    this.resultId,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? androidDeepLink;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? destinationUrl;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? iosDeepLink;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? organicPinId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? resultId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is QuizPinResult &&
    other.androidDeepLink == androidDeepLink &&
    other.destinationUrl == destinationUrl &&
    other.iosDeepLink == iosDeepLink &&
    other.organicPinId == organicPinId &&
    other.resultId == resultId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (androidDeepLink == null ? 0 : androidDeepLink!.hashCode) +
    (destinationUrl == null ? 0 : destinationUrl!.hashCode) +
    (iosDeepLink == null ? 0 : iosDeepLink!.hashCode) +
    (organicPinId == null ? 0 : organicPinId!.hashCode) +
    (resultId == null ? 0 : resultId!.hashCode);

  @override
  String toString() => 'QuizPinResult[androidDeepLink=$androidDeepLink, destinationUrl=$destinationUrl, iosDeepLink=$iosDeepLink, organicPinId=$organicPinId, resultId=$resultId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.androidDeepLink != null) {
      json[r'android_deep_link'] = this.androidDeepLink;
    } else {
      json[r'android_deep_link'] = null;
    }
    if (this.destinationUrl != null) {
      json[r'destination_url'] = this.destinationUrl;
    } else {
      json[r'destination_url'] = null;
    }
    if (this.iosDeepLink != null) {
      json[r'ios_deep_link'] = this.iosDeepLink;
    } else {
      json[r'ios_deep_link'] = null;
    }
    if (this.organicPinId != null) {
      json[r'organic_pin_id'] = this.organicPinId;
    } else {
      json[r'organic_pin_id'] = null;
    }
    if (this.resultId != null) {
      json[r'result_id'] = this.resultId;
    } else {
      json[r'result_id'] = null;
    }
    return json;
  }

  /// Returns a new [QuizPinResult] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static QuizPinResult? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "QuizPinResult[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "QuizPinResult[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return QuizPinResult(
        androidDeepLink: mapValueOfType<String>(json, r'android_deep_link'),
        destinationUrl: mapValueOfType<String>(json, r'destination_url'),
        iosDeepLink: mapValueOfType<String>(json, r'ios_deep_link'),
        organicPinId: mapValueOfType<String>(json, r'organic_pin_id'),
        resultId: num.parse('${json[r'result_id']}'),
      );
    }
    return null;
  }

  static List<QuizPinResult> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <QuizPinResult>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = QuizPinResult.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, QuizPinResult> mapFromJson(dynamic json) {
    final map = <String, QuizPinResult>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = QuizPinResult.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of QuizPinResult-objects as value to a dart map
  static Map<String, List<QuizPinResult>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<QuizPinResult>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = QuizPinResult.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

