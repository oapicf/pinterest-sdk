//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SSIOAccountItem {
  /// Returns a new [SSIOAccountItem] instance.
  SSIOAccountItem({
    this.addresses = const [],
    this.id,
    this.ioTerms,
    this.ioTermsId,
    this.ioType,
    this.rowTerms,
    this.rowTermsId,
    this.usTerms,
    this.usTermsId,
  });

  /// Address information that is associated with this account.
  List<SSIOAccountAddress> addresses;

  /// Salesforce id for billto_info
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// Salesforce text for IO Terms and Conditions
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? ioTerms;

  /// Salesforce id for IO Terms and Conditions
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? ioTermsId;

  /// Insertion Order Type - Pinterest Paper or Agency Paper
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? ioType;

  /// Salesforce text for Rest of the World Terms and Conditions
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? rowTerms;

  /// Salesforce id for Rest of the World Terms and Conditions
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? rowTermsId;

  /// Salesforce text for US Terms and Conditions
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? usTerms;

  /// Salesforce id for US Terms and Conditions
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? usTermsId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SSIOAccountItem &&
    _deepEquality.equals(other.addresses, addresses) &&
    other.id == id &&
    other.ioTerms == ioTerms &&
    other.ioTermsId == ioTermsId &&
    other.ioType == ioType &&
    other.rowTerms == rowTerms &&
    other.rowTermsId == rowTermsId &&
    other.usTerms == usTerms &&
    other.usTermsId == usTermsId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (addresses.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (ioTerms == null ? 0 : ioTerms!.hashCode) +
    (ioTermsId == null ? 0 : ioTermsId!.hashCode) +
    (ioType == null ? 0 : ioType!.hashCode) +
    (rowTerms == null ? 0 : rowTerms!.hashCode) +
    (rowTermsId == null ? 0 : rowTermsId!.hashCode) +
    (usTerms == null ? 0 : usTerms!.hashCode) +
    (usTermsId == null ? 0 : usTermsId!.hashCode);

  @override
  String toString() => 'SSIOAccountItem[addresses=$addresses, id=$id, ioTerms=$ioTerms, ioTermsId=$ioTermsId, ioType=$ioType, rowTerms=$rowTerms, rowTermsId=$rowTermsId, usTerms=$usTerms, usTermsId=$usTermsId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'addresses'] = this.addresses;
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.ioTerms != null) {
      json[r'io_terms'] = this.ioTerms;
    } else {
      json[r'io_terms'] = null;
    }
    if (this.ioTermsId != null) {
      json[r'io_terms_id'] = this.ioTermsId;
    } else {
      json[r'io_terms_id'] = null;
    }
    if (this.ioType != null) {
      json[r'io_type'] = this.ioType;
    } else {
      json[r'io_type'] = null;
    }
    if (this.rowTerms != null) {
      json[r'row_terms'] = this.rowTerms;
    } else {
      json[r'row_terms'] = null;
    }
    if (this.rowTermsId != null) {
      json[r'row_terms_id'] = this.rowTermsId;
    } else {
      json[r'row_terms_id'] = null;
    }
    if (this.usTerms != null) {
      json[r'us_terms'] = this.usTerms;
    } else {
      json[r'us_terms'] = null;
    }
    if (this.usTermsId != null) {
      json[r'us_terms_id'] = this.usTermsId;
    } else {
      json[r'us_terms_id'] = null;
    }
    return json;
  }

  /// Returns a new [SSIOAccountItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SSIOAccountItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return SSIOAccountItem(
        addresses: SSIOAccountAddress.listFromJson(json[r'addresses']),
        id: mapValueOfType<String>(json, r'id'),
        ioTerms: mapValueOfType<String>(json, r'io_terms'),
        ioTermsId: mapValueOfType<String>(json, r'io_terms_id'),
        ioType: mapValueOfType<String>(json, r'io_type'),
        rowTerms: mapValueOfType<String>(json, r'row_terms'),
        rowTermsId: mapValueOfType<String>(json, r'row_terms_id'),
        usTerms: mapValueOfType<String>(json, r'us_terms'),
        usTermsId: mapValueOfType<String>(json, r'us_terms_id'),
      );
    }
    return null;
  }

  static List<SSIOAccountItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SSIOAccountItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SSIOAccountItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SSIOAccountItem> mapFromJson(dynamic json) {
    final map = <String, SSIOAccountItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SSIOAccountItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SSIOAccountItem-objects as value to a dart map
  static Map<String, List<SSIOAccountItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SSIOAccountItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SSIOAccountItem.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

