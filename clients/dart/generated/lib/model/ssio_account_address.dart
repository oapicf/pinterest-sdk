//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SSIOAccountAddress {
  /// Returns a new [SSIOAccountAddress] instance.
  SSIOAccountAddress({
    this.addressId,
    this.display,
    this.orderLegalEntity,
    this.purpose,
  });

  /// Salesforce id for address
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? addressId;

  /// Address display
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? display;

  /// Legal entity for this insertion order
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? orderLegalEntity;

  /// Purpose for which the address is used, usually Billing or Businness
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? purpose;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SSIOAccountAddress &&
    other.addressId == addressId &&
    other.display == display &&
    other.orderLegalEntity == orderLegalEntity &&
    other.purpose == purpose;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (addressId == null ? 0 : addressId!.hashCode) +
    (display == null ? 0 : display!.hashCode) +
    (orderLegalEntity == null ? 0 : orderLegalEntity!.hashCode) +
    (purpose == null ? 0 : purpose!.hashCode);

  @override
  String toString() => 'SSIOAccountAddress[addressId=$addressId, display=$display, orderLegalEntity=$orderLegalEntity, purpose=$purpose]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.addressId != null) {
      json[r'address_id'] = this.addressId;
    } else {
      json[r'address_id'] = null;
    }
    if (this.display != null) {
      json[r'display'] = this.display;
    } else {
      json[r'display'] = null;
    }
    if (this.orderLegalEntity != null) {
      json[r'order_legal_entity'] = this.orderLegalEntity;
    } else {
      json[r'order_legal_entity'] = null;
    }
    if (this.purpose != null) {
      json[r'purpose'] = this.purpose;
    } else {
      json[r'purpose'] = null;
    }
    return json;
  }

  /// Returns a new [SSIOAccountAddress] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SSIOAccountAddress? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return SSIOAccountAddress(
        addressId: mapValueOfType<String>(json, r'address_id'),
        display: mapValueOfType<String>(json, r'display'),
        orderLegalEntity: mapValueOfType<String>(json, r'order_legal_entity'),
        purpose: mapValueOfType<String>(json, r'purpose'),
      );
    }
    return null;
  }

  static List<SSIOAccountAddress> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SSIOAccountAddress>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SSIOAccountAddress.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SSIOAccountAddress> mapFromJson(dynamic json) {
    final map = <String, SSIOAccountAddress>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SSIOAccountAddress.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SSIOAccountAddress-objects as value to a dart map
  static Map<String, List<SSIOAccountAddress>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SSIOAccountAddress>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SSIOAccountAddress.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

