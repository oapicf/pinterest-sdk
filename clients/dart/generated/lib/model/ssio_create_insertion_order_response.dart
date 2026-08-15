//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SSIOCreateInsertionOrderResponse {
  /// Returns a new [SSIOCreateInsertionOrderResponse] instance.
  SSIOCreateInsertionOrderResponse({
    this.pinOrderId,
  });

  /// Salesforce order id
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? pinOrderId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SSIOCreateInsertionOrderResponse &&
    other.pinOrderId == pinOrderId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (pinOrderId == null ? 0 : pinOrderId!.hashCode);

  @override
  String toString() => 'SSIOCreateInsertionOrderResponse[pinOrderId=$pinOrderId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.pinOrderId != null) {
      json[r'pin_order_id'] = this.pinOrderId;
    } else {
      json[r'pin_order_id'] = null;
    }
    return json;
  }

  /// Returns a new [SSIOCreateInsertionOrderResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SSIOCreateInsertionOrderResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "SSIOCreateInsertionOrderResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "SSIOCreateInsertionOrderResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return SSIOCreateInsertionOrderResponse(
        pinOrderId: mapValueOfType<String>(json, r'pin_order_id'),
      );
    }
    return null;
  }

  static List<SSIOCreateInsertionOrderResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SSIOCreateInsertionOrderResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SSIOCreateInsertionOrderResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SSIOCreateInsertionOrderResponse> mapFromJson(dynamic json) {
    final map = <String, SSIOCreateInsertionOrderResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SSIOCreateInsertionOrderResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SSIOCreateInsertionOrderResponse-objects as value to a dart map
  static Map<String, List<SSIOCreateInsertionOrderResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SSIOCreateInsertionOrderResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SSIOCreateInsertionOrderResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

