//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RelatedTerms {
  /// Returns a new [RelatedTerms] instance.
  RelatedTerms({
    this.id,
    this.relatedTermCount,
    this.relatedTermsList = const [],
  });

  /// First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// Total number of related terms returned
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? relatedTermCount;

  /// The id of the advertiser.
  List<RelatedTermsRelatedTermsListInner> relatedTermsList;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RelatedTerms &&
    other.id == id &&
    other.relatedTermCount == relatedTermCount &&
    _deepEquality.equals(other.relatedTermsList, relatedTermsList);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (relatedTermCount == null ? 0 : relatedTermCount!.hashCode) +
    (relatedTermsList.hashCode);

  @override
  String toString() => 'RelatedTerms[id=$id, relatedTermCount=$relatedTermCount, relatedTermsList=$relatedTermsList]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.relatedTermCount != null) {
      json[r'related_term_count'] = this.relatedTermCount;
    } else {
      json[r'related_term_count'] = null;
    }
      json[r'related_terms_list'] = this.relatedTermsList;
    return json;
  }

  /// Returns a new [RelatedTerms] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RelatedTerms? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RelatedTerms[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RelatedTerms[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RelatedTerms(
        id: mapValueOfType<String>(json, r'id'),
        relatedTermCount: mapValueOfType<int>(json, r'related_term_count'),
        relatedTermsList: RelatedTermsRelatedTermsListInner.listFromJson(json[r'related_terms_list']),
      );
    }
    return null;
  }

  static List<RelatedTerms> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RelatedTerms>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RelatedTerms.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RelatedTerms> mapFromJson(dynamic json) {
    final map = <String, RelatedTerms>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RelatedTerms.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RelatedTerms-objects as value to a dart map
  static Map<String, List<RelatedTerms>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RelatedTerms>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RelatedTerms.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

