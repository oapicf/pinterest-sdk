//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LeadFormPolicyLink {
  /// Returns a new [LeadFormPolicyLink] instance.
  LeadFormPolicyLink({
    this.label,
    this.link,
  });

  /// Policy label for an additional policy link.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? label;

  /// Policy link for an additional policy link.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? link;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LeadFormPolicyLink &&
    other.label == label &&
    other.link == link;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (label == null ? 0 : label!.hashCode) +
    (link == null ? 0 : link!.hashCode);

  @override
  String toString() => 'LeadFormPolicyLink[label=$label, link=$link]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.label != null) {
      json[r'label'] = this.label;
    } else {
      json[r'label'] = null;
    }
    if (this.link != null) {
      json[r'link'] = this.link;
    } else {
      json[r'link'] = null;
    }
    return json;
  }

  /// Returns a new [LeadFormPolicyLink] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LeadFormPolicyLink? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return LeadFormPolicyLink(
        label: mapValueOfType<String>(json, r'label'),
        link: mapValueOfType<String>(json, r'link'),
      );
    }
    return null;
  }

  static List<LeadFormPolicyLink> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LeadFormPolicyLink>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LeadFormPolicyLink.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LeadFormPolicyLink> mapFromJson(dynamic json) {
    final map = <String, LeadFormPolicyLink>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LeadFormPolicyLink.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LeadFormPolicyLink-objects as value to a dart map
  static Map<String, List<LeadFormPolicyLink>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LeadFormPolicyLink>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LeadFormPolicyLink.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

