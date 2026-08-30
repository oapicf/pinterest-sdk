//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdsCreditRedeem {
  /// Returns a new [AdsCreditRedeem] instance.
  AdsCreditRedeem({
    this.errorCode,
    this.errorMessage,
    this.success,
  });

  /// Error code type if error occurs
  int? errorCode;

  /// Reason for failure
  String? errorMessage;

  /// Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? success;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdsCreditRedeem &&
    other.errorCode == errorCode &&
    other.errorMessage == errorMessage &&
    other.success == success;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (errorCode == null ? 0 : errorCode!.hashCode) +
    (errorMessage == null ? 0 : errorMessage!.hashCode) +
    (success == null ? 0 : success!.hashCode);

  @override
  String toString() => 'AdsCreditRedeem[errorCode=$errorCode, errorMessage=$errorMessage, success=$success]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.errorCode != null) {
      json[r'errorCode'] = this.errorCode;
    } else {
      json[r'errorCode'] = null;
    }
    if (this.errorMessage != null) {
      json[r'errorMessage'] = this.errorMessage;
    } else {
      json[r'errorMessage'] = null;
    }
    if (this.success != null) {
      json[r'success'] = this.success;
    } else {
      json[r'success'] = null;
    }
    return json;
  }

  /// Returns a new [AdsCreditRedeem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdsCreditRedeem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return AdsCreditRedeem(
        errorCode: mapValueOfType<int>(json, r'errorCode'),
        errorMessage: mapValueOfType<String>(json, r'errorMessage'),
        success: mapValueOfType<bool>(json, r'success'),
      );
    }
    return null;
  }

  static List<AdsCreditRedeem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdsCreditRedeem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdsCreditRedeem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdsCreditRedeem> mapFromJson(dynamic json) {
    final map = <String, AdsCreditRedeem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdsCreditRedeem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdsCreditRedeem-objects as value to a dart map
  static Map<String, List<AdsCreditRedeem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdsCreditRedeem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdsCreditRedeem.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

