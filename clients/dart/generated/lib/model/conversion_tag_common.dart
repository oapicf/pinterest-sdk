//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionTagCommon {
  /// Returns a new [ConversionTagCommon] instance.
  ConversionTagCommon({
    this.codeSnippet,
    this.configs,
    this.enhancedMatchStatus,
    this.id,
    this.lastFiredTimeMs,
    required this.name,
    this.version,
  });

  /// Tag code snippet.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? codeSnippet;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConversionTagConfigs? configs;

  /// The enhanced match status of the tag
  EnhancedMatchStatusType? enhancedMatchStatus;

  /// Tag ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// Time for the last event fired.
  num? lastFiredTimeMs;

  /// Conversion tag name.
  String name;

  /// Version number.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? version;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionTagCommon &&
    other.codeSnippet == codeSnippet &&
    other.configs == configs &&
    other.enhancedMatchStatus == enhancedMatchStatus &&
    other.id == id &&
    other.lastFiredTimeMs == lastFiredTimeMs &&
    other.name == name &&
    other.version == version;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (codeSnippet == null ? 0 : codeSnippet!.hashCode) +
    (configs == null ? 0 : configs!.hashCode) +
    (enhancedMatchStatus == null ? 0 : enhancedMatchStatus!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (lastFiredTimeMs == null ? 0 : lastFiredTimeMs!.hashCode) +
    (name.hashCode) +
    (version == null ? 0 : version!.hashCode);

  @override
  String toString() => 'ConversionTagCommon[codeSnippet=$codeSnippet, configs=$configs, enhancedMatchStatus=$enhancedMatchStatus, id=$id, lastFiredTimeMs=$lastFiredTimeMs, name=$name, version=$version]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.codeSnippet != null) {
      json[r'code_snippet'] = this.codeSnippet;
    } else {
      json[r'code_snippet'] = null;
    }
    if (this.configs != null) {
      json[r'configs'] = this.configs;
    } else {
      json[r'configs'] = null;
    }
    if (this.enhancedMatchStatus != null) {
      json[r'enhanced_match_status'] = this.enhancedMatchStatus;
    } else {
      json[r'enhanced_match_status'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.lastFiredTimeMs != null) {
      json[r'last_fired_time_ms'] = this.lastFiredTimeMs;
    } else {
      json[r'last_fired_time_ms'] = null;
    }
      json[r'name'] = this.name;
    if (this.version != null) {
      json[r'version'] = this.version;
    } else {
      json[r'version'] = null;
    }
    return json;
  }

  /// Returns a new [ConversionTagCommon] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionTagCommon? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ConversionTagCommon[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ConversionTagCommon[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ConversionTagCommon(
        codeSnippet: mapValueOfType<String>(json, r'code_snippet'),
        configs: ConversionTagConfigs.fromJson(json[r'configs']),
        enhancedMatchStatus: EnhancedMatchStatusType.fromJson(json[r'enhanced_match_status']),
        id: mapValueOfType<String>(json, r'id'),
        lastFiredTimeMs: json[r'last_fired_time_ms'] == null
            ? null
            : num.parse('${json[r'last_fired_time_ms']}'),
        name: mapValueOfType<String>(json, r'name')!,
        version: mapValueOfType<String>(json, r'version'),
      );
    }
    return null;
  }

  static List<ConversionTagCommon> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionTagCommon>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionTagCommon.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionTagCommon> mapFromJson(dynamic json) {
    final map = <String, ConversionTagCommon>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionTagCommon.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionTagCommon-objects as value to a dart map
  static Map<String, List<ConversionTagCommon>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionTagCommon>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionTagCommon.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'name',
  };
}

