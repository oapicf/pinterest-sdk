//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SSIOAccount {
  /// Returns a new [SSIOAccount] instance.
  SSIOAccount({
    this.billtoInfos = const [],
    this.canEdit,
    this.currency,
    this.eligible,
    this.error,
    this.pmpNames = const [],
  });

  /// An array of Salesforce account information that includes address, io terms, etc.
  List<SSIOAccountItem> billtoInfos;

  /// Advertiser eligible to update order lines
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? canEdit;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? currency;

  /// Advertiser eligible to create order lines
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? eligible;

  /// Error indicator from Salesforce which could be \"No Error\"
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? error;

  List<SSIOAccountPMPName> pmpNames;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SSIOAccount &&
    _deepEquality.equals(other.billtoInfos, billtoInfos) &&
    other.canEdit == canEdit &&
    other.currency == currency &&
    other.eligible == eligible &&
    other.error == error &&
    _deepEquality.equals(other.pmpNames, pmpNames);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (billtoInfos.hashCode) +
    (canEdit == null ? 0 : canEdit!.hashCode) +
    (currency == null ? 0 : currency!.hashCode) +
    (eligible == null ? 0 : eligible!.hashCode) +
    (error == null ? 0 : error!.hashCode) +
    (pmpNames.hashCode);

  @override
  String toString() => 'SSIOAccount[billtoInfos=$billtoInfos, canEdit=$canEdit, currency=$currency, eligible=$eligible, error=$error, pmpNames=$pmpNames]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'billto_infos'] = this.billtoInfos;
    if (this.canEdit != null) {
      json[r'can_edit'] = this.canEdit;
    } else {
      json[r'can_edit'] = null;
    }
    if (this.currency != null) {
      json[r'currency'] = this.currency;
    } else {
      json[r'currency'] = null;
    }
    if (this.eligible != null) {
      json[r'eligible'] = this.eligible;
    } else {
      json[r'eligible'] = null;
    }
    if (this.error != null) {
      json[r'error'] = this.error;
    } else {
      json[r'error'] = null;
    }
      json[r'pmp_names'] = this.pmpNames;
    return json;
  }

  /// Returns a new [SSIOAccount] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SSIOAccount? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return SSIOAccount(
        billtoInfos: SSIOAccountItem.listFromJson(json[r'billto_infos']),
        canEdit: mapValueOfType<bool>(json, r'can_edit'),
        currency: mapValueOfType<String>(json, r'currency'),
        eligible: mapValueOfType<bool>(json, r'eligible'),
        error: mapValueOfType<String>(json, r'error'),
        pmpNames: SSIOAccountPMPName.listFromJson(json[r'pmp_names']),
      );
    }
    return null;
  }

  static List<SSIOAccount> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SSIOAccount>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SSIOAccount.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SSIOAccount> mapFromJson(dynamic json) {
    final map = <String, SSIOAccount>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SSIOAccount.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SSIOAccount-objects as value to a dart map
  static Map<String, List<SSIOAccount>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SSIOAccount>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SSIOAccount.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

