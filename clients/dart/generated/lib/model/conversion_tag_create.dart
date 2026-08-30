//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionTagCreate {
  /// Returns a new [ConversionTagCreate] instance.
  ConversionTagCreate({
    this.aemDbEnabled = false,
    this.aemEnabled = false,
    this.aemExternalIdEnabled = false,
    this.aemFnlnEnabled = false,
    this.aemGeEnabled = false,
    this.aemLocEnabled = false,
    this.aemPhEnabled = false,
    this.mdFrequency = 1,
    required this.name,
  });

  /// Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  bool? aemDbEnabled;

  /// Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  bool? aemEnabled;

  /// Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  bool? aemExternalIdEnabled;

  /// Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  bool? aemFnlnEnabled;

  /// Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  bool? aemGeEnabled;

  /// Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  bool? aemLocEnabled;

  /// Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  bool? aemPhEnabled;

  /// Metadata ingestion frequency.
  num? mdFrequency;

  /// Conversion tag name.
  String name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionTagCreate &&
    other.aemDbEnabled == aemDbEnabled &&
    other.aemEnabled == aemEnabled &&
    other.aemExternalIdEnabled == aemExternalIdEnabled &&
    other.aemFnlnEnabled == aemFnlnEnabled &&
    other.aemGeEnabled == aemGeEnabled &&
    other.aemLocEnabled == aemLocEnabled &&
    other.aemPhEnabled == aemPhEnabled &&
    other.mdFrequency == mdFrequency &&
    other.name == name;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (aemDbEnabled == null ? 0 : aemDbEnabled!.hashCode) +
    (aemEnabled == null ? 0 : aemEnabled!.hashCode) +
    (aemExternalIdEnabled == null ? 0 : aemExternalIdEnabled!.hashCode) +
    (aemFnlnEnabled == null ? 0 : aemFnlnEnabled!.hashCode) +
    (aemGeEnabled == null ? 0 : aemGeEnabled!.hashCode) +
    (aemLocEnabled == null ? 0 : aemLocEnabled!.hashCode) +
    (aemPhEnabled == null ? 0 : aemPhEnabled!.hashCode) +
    (mdFrequency == null ? 0 : mdFrequency!.hashCode) +
    (name.hashCode);

  @override
  String toString() => 'ConversionTagCreate[aemDbEnabled=$aemDbEnabled, aemEnabled=$aemEnabled, aemExternalIdEnabled=$aemExternalIdEnabled, aemFnlnEnabled=$aemFnlnEnabled, aemGeEnabled=$aemGeEnabled, aemLocEnabled=$aemLocEnabled, aemPhEnabled=$aemPhEnabled, mdFrequency=$mdFrequency, name=$name]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.aemDbEnabled != null) {
      json[r'aem_db_enabled'] = this.aemDbEnabled;
    } else {
      json[r'aem_db_enabled'] = null;
    }
    if (this.aemEnabled != null) {
      json[r'aem_enabled'] = this.aemEnabled;
    } else {
      json[r'aem_enabled'] = null;
    }
    if (this.aemExternalIdEnabled != null) {
      json[r'aem_external_id_enabled'] = this.aemExternalIdEnabled;
    } else {
      json[r'aem_external_id_enabled'] = null;
    }
    if (this.aemFnlnEnabled != null) {
      json[r'aem_fnln_enabled'] = this.aemFnlnEnabled;
    } else {
      json[r'aem_fnln_enabled'] = null;
    }
    if (this.aemGeEnabled != null) {
      json[r'aem_ge_enabled'] = this.aemGeEnabled;
    } else {
      json[r'aem_ge_enabled'] = null;
    }
    if (this.aemLocEnabled != null) {
      json[r'aem_loc_enabled'] = this.aemLocEnabled;
    } else {
      json[r'aem_loc_enabled'] = null;
    }
    if (this.aemPhEnabled != null) {
      json[r'aem_ph_enabled'] = this.aemPhEnabled;
    } else {
      json[r'aem_ph_enabled'] = null;
    }
    if (this.mdFrequency != null) {
      json[r'md_frequency'] = this.mdFrequency;
    } else {
      json[r'md_frequency'] = null;
    }
      json[r'name'] = this.name;
    return json;
  }

  /// Returns a new [ConversionTagCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionTagCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'name'), 'Required key "ConversionTagCreate[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "ConversionTagCreate[name]" has a null value in JSON.');
        return true;
      }());

      return ConversionTagCreate(
        aemDbEnabled: mapValueOfType<bool>(json, r'aem_db_enabled') ?? false,
        aemEnabled: mapValueOfType<bool>(json, r'aem_enabled') ?? false,
        aemExternalIdEnabled: mapValueOfType<bool>(json, r'aem_external_id_enabled') ?? false,
        aemFnlnEnabled: mapValueOfType<bool>(json, r'aem_fnln_enabled') ?? false,
        aemGeEnabled: mapValueOfType<bool>(json, r'aem_ge_enabled') ?? false,
        aemLocEnabled: mapValueOfType<bool>(json, r'aem_loc_enabled') ?? false,
        aemPhEnabled: mapValueOfType<bool>(json, r'aem_ph_enabled') ?? false,
        mdFrequency: json[r'md_frequency'] == null
            ? 1
            : num.parse('${json[r'md_frequency']}'),
        name: mapValueOfType<String>(json, r'name')!,
      );
    }
    return null;
  }

  static List<ConversionTagCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionTagCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionTagCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionTagCreate> mapFromJson(dynamic json) {
    final map = <String, ConversionTagCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionTagCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionTagCreate-objects as value to a dart map
  static Map<String, List<ConversionTagCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionTagCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionTagCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'name',
  };
}

