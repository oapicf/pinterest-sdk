//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TitleKeywordsFilter {
  /// Returns a new [TitleKeywordsFilter] instance.
  TitleKeywordsFilter({
    required this.TITLE_KEYWORDS,
  });

  CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TitleKeywordsFilter &&
    other.TITLE_KEYWORDS == TITLE_KEYWORDS;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (TITLE_KEYWORDS.hashCode);

  @override
  String toString() => 'TitleKeywordsFilter[TITLE_KEYWORDS=$TITLE_KEYWORDS]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'TITLE_KEYWORDS'] = this.TITLE_KEYWORDS;
    return json;
  }

  /// Returns a new [TitleKeywordsFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TitleKeywordsFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TitleKeywordsFilter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TitleKeywordsFilter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TitleKeywordsFilter(
        TITLE_KEYWORDS: mapValueOfType<CatalogsProductGroupMultipleStringCriteria>(json, r'TITLE_KEYWORDS')!,
      );
    }
    return null;
  }

  static List<TitleKeywordsFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TitleKeywordsFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TitleKeywordsFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TitleKeywordsFilter> mapFromJson(dynamic json) {
    final map = <String, TitleKeywordsFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TitleKeywordsFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TitleKeywordsFilter-objects as value to a dart map
  static Map<String, List<TitleKeywordsFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TitleKeywordsFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TitleKeywordsFilter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'TITLE_KEYWORDS',
  };
}

