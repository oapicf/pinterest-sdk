//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CustomerListRecordRow {
  /// Returns a new [CustomerListRecordRow] instance.
  CustomerListRecordRow({
    this.email,
    this.externalId,
    this.hashedPhoneNumber,
    this.hashedPinnerId,
    this.ipAddress,
    this.liverampEnvelope,
    this.maid,
    this.userAgent,
  });

  /// Email address (plain or hashed with SHA1, SHA256, or MD5).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? email;

  /// External ID identifier (not hashed).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? externalId;

  /// Hashed phone number (hashed with SHA1, SHA256, or MD5).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? hashedPhoneNumber;

  /// Hashed pinner ID (hashed with SHA1, SHA256, or MD5).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? hashedPinnerId;

  /// IP address (not hashed).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? ipAddress;

  /// LiveRamp envelope identifier (Base64-encoded, not hashed).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? liverampEnvelope;

  /// Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? maid;

  /// User agent string (not hashed).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? userAgent;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CustomerListRecordRow &&
    other.email == email &&
    other.externalId == externalId &&
    other.hashedPhoneNumber == hashedPhoneNumber &&
    other.hashedPinnerId == hashedPinnerId &&
    other.ipAddress == ipAddress &&
    other.liverampEnvelope == liverampEnvelope &&
    other.maid == maid &&
    other.userAgent == userAgent;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (email == null ? 0 : email!.hashCode) +
    (externalId == null ? 0 : externalId!.hashCode) +
    (hashedPhoneNumber == null ? 0 : hashedPhoneNumber!.hashCode) +
    (hashedPinnerId == null ? 0 : hashedPinnerId!.hashCode) +
    (ipAddress == null ? 0 : ipAddress!.hashCode) +
    (liverampEnvelope == null ? 0 : liverampEnvelope!.hashCode) +
    (maid == null ? 0 : maid!.hashCode) +
    (userAgent == null ? 0 : userAgent!.hashCode);

  @override
  String toString() => 'CustomerListRecordRow[email=$email, externalId=$externalId, hashedPhoneNumber=$hashedPhoneNumber, hashedPinnerId=$hashedPinnerId, ipAddress=$ipAddress, liverampEnvelope=$liverampEnvelope, maid=$maid, userAgent=$userAgent]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.email != null) {
      json[r'email'] = this.email;
    } else {
      json[r'email'] = null;
    }
    if (this.externalId != null) {
      json[r'external_id'] = this.externalId;
    } else {
      json[r'external_id'] = null;
    }
    if (this.hashedPhoneNumber != null) {
      json[r'hashed_phone_number'] = this.hashedPhoneNumber;
    } else {
      json[r'hashed_phone_number'] = null;
    }
    if (this.hashedPinnerId != null) {
      json[r'hashed_pinner_id'] = this.hashedPinnerId;
    } else {
      json[r'hashed_pinner_id'] = null;
    }
    if (this.ipAddress != null) {
      json[r'ip_address'] = this.ipAddress;
    } else {
      json[r'ip_address'] = null;
    }
    if (this.liverampEnvelope != null) {
      json[r'liveramp_envelope'] = this.liverampEnvelope;
    } else {
      json[r'liveramp_envelope'] = null;
    }
    if (this.maid != null) {
      json[r'maid'] = this.maid;
    } else {
      json[r'maid'] = null;
    }
    if (this.userAgent != null) {
      json[r'user_agent'] = this.userAgent;
    } else {
      json[r'user_agent'] = null;
    }
    return json;
  }

  /// Returns a new [CustomerListRecordRow] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CustomerListRecordRow? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return CustomerListRecordRow(
        email: mapValueOfType<String>(json, r'email'),
        externalId: mapValueOfType<String>(json, r'external_id'),
        hashedPhoneNumber: mapValueOfType<String>(json, r'hashed_phone_number'),
        hashedPinnerId: mapValueOfType<String>(json, r'hashed_pinner_id'),
        ipAddress: mapValueOfType<String>(json, r'ip_address'),
        liverampEnvelope: mapValueOfType<String>(json, r'liveramp_envelope'),
        maid: mapValueOfType<String>(json, r'maid'),
        userAgent: mapValueOfType<String>(json, r'user_agent'),
      );
    }
    return null;
  }

  static List<CustomerListRecordRow> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CustomerListRecordRow>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CustomerListRecordRow.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CustomerListRecordRow> mapFromJson(dynamic json) {
    final map = <String, CustomerListRecordRow>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CustomerListRecordRow.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CustomerListRecordRow-objects as value to a dart map
  static Map<String, List<CustomerListRecordRow>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CustomerListRecordRow>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CustomerListRecordRow.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

