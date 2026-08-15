//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class NotificationResponse {
  /// Returns a new [NotificationResponse] instance.
  NotificationResponse({
    this.success,
    this.receivedAt,
    this.errorMsg,
  });

  /// Returns true if the notification accepted.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? success;

  /// Received time. Unix timestamp in seconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? receivedAt;

  /// error message when success is false
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? errorMsg;

  @override
  bool operator ==(Object other) => identical(this, other) || other is NotificationResponse &&
    other.success == success &&
    other.receivedAt == receivedAt &&
    other.errorMsg == errorMsg;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (success == null ? 0 : success!.hashCode) +
    (receivedAt == null ? 0 : receivedAt!.hashCode) +
    (errorMsg == null ? 0 : errorMsg!.hashCode);

  @override
  String toString() => 'NotificationResponse[success=$success, receivedAt=$receivedAt, errorMsg=$errorMsg]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.success != null) {
      json[r'success'] = this.success;
    } else {
      json[r'success'] = null;
    }
    if (this.receivedAt != null) {
      json[r'received_at'] = this.receivedAt;
    } else {
      json[r'received_at'] = null;
    }
    if (this.errorMsg != null) {
      json[r'error_msg'] = this.errorMsg;
    } else {
      json[r'error_msg'] = null;
    }
    return json;
  }

  /// Returns a new [NotificationResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static NotificationResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "NotificationResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "NotificationResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return NotificationResponse(
        success: mapValueOfType<bool>(json, r'success'),
        receivedAt: mapValueOfType<int>(json, r'received_at'),
        errorMsg: mapValueOfType<String>(json, r'error_msg'),
      );
    }
    return null;
  }

  static List<NotificationResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <NotificationResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = NotificationResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, NotificationResponse> mapFromJson(dynamic json) {
    final map = <String, NotificationResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = NotificationResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of NotificationResponse-objects as value to a dart map
  static Map<String, List<NotificationResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<NotificationResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = NotificationResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

