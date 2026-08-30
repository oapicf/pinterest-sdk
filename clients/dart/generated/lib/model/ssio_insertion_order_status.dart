//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SSIOInsertionOrderStatus {
  /// Returns a new [SSIOInsertionOrderStatus] instance.
  SSIOInsertionOrderStatus({
    this.creationTime,
    this.pinOrderId,
    this.status,
  });

  /// Salesforce insertion order creation time
  String? creationTime;

  /// Salesforce order id
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? pinOrderId;

  /// Salesforce insertion order status
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SSIOInsertionOrderStatus &&
    other.creationTime == creationTime &&
    other.pinOrderId == pinOrderId &&
    other.status == status;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (creationTime == null ? 0 : creationTime!.hashCode) +
    (pinOrderId == null ? 0 : pinOrderId!.hashCode) +
    (status == null ? 0 : status!.hashCode);

  @override
  String toString() => 'SSIOInsertionOrderStatus[creationTime=$creationTime, pinOrderId=$pinOrderId, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.creationTime != null) {
      json[r'creation_time'] = this.creationTime;
    } else {
      json[r'creation_time'] = null;
    }
    if (this.pinOrderId != null) {
      json[r'pin_order_id'] = this.pinOrderId;
    } else {
      json[r'pin_order_id'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    return json;
  }

  /// Returns a new [SSIOInsertionOrderStatus] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SSIOInsertionOrderStatus? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return SSIOInsertionOrderStatus(
        creationTime: mapValueOfType<String>(json, r'creation_time'),
        pinOrderId: mapValueOfType<String>(json, r'pin_order_id'),
        status: mapValueOfType<String>(json, r'status'),
      );
    }
    return null;
  }

  static List<SSIOInsertionOrderStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SSIOInsertionOrderStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SSIOInsertionOrderStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SSIOInsertionOrderStatus> mapFromJson(dynamic json) {
    final map = <String, SSIOInsertionOrderStatus>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SSIOInsertionOrderStatus.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SSIOInsertionOrderStatus-objects as value to a dart map
  static Map<String, List<SSIOInsertionOrderStatus>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SSIOInsertionOrderStatus>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SSIOInsertionOrderStatus.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

