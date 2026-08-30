//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TrendsEditorial {
  /// Returns a new [TrendsEditorial] instance.
  TrendsEditorial({
    required this.boardUrl,
    required this.description,
    this.interests = const [],
    this.pinsUrl = const [],
    this.relatedKeywords = const [],
    required this.title,
  });

  /// URL of the editorial board
  String boardUrl;

  /// Description of the editorial article
  String description;

  /// List of interests related to the editorial article
  List<String> interests;

  /// URL of the pins related to the editorial article
  List<String> pinsUrl;

  /// List of keywords related to the editorial article
  List<KeywordInfo> relatedKeywords;

  /// Title of the editorial article
  String title;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TrendsEditorial &&
    other.boardUrl == boardUrl &&
    other.description == description &&
    _deepEquality.equals(other.interests, interests) &&
    _deepEquality.equals(other.pinsUrl, pinsUrl) &&
    _deepEquality.equals(other.relatedKeywords, relatedKeywords) &&
    other.title == title;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (boardUrl.hashCode) +
    (description.hashCode) +
    (interests.hashCode) +
    (pinsUrl.hashCode) +
    (relatedKeywords.hashCode) +
    (title.hashCode);

  @override
  String toString() => 'TrendsEditorial[boardUrl=$boardUrl, description=$description, interests=$interests, pinsUrl=$pinsUrl, relatedKeywords=$relatedKeywords, title=$title]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'board_url'] = this.boardUrl;
      json[r'description'] = this.description;
      json[r'interests'] = this.interests;
      json[r'pins_url'] = this.pinsUrl;
      json[r'related_keywords'] = this.relatedKeywords;
      json[r'title'] = this.title;
    return json;
  }

  /// Returns a new [TrendsEditorial] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TrendsEditorial? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'board_url'), 'Required key "TrendsEditorial[board_url]" is missing from JSON.');
        assert(json[r'board_url'] != null, 'Required key "TrendsEditorial[board_url]" has a null value in JSON.');
        assert(json.containsKey(r'description'), 'Required key "TrendsEditorial[description]" is missing from JSON.');
        assert(json[r'description'] != null, 'Required key "TrendsEditorial[description]" has a null value in JSON.');
        assert(json.containsKey(r'interests'), 'Required key "TrendsEditorial[interests]" is missing from JSON.');
        assert(json[r'interests'] != null, 'Required key "TrendsEditorial[interests]" has a null value in JSON.');
        assert(json.containsKey(r'pins_url'), 'Required key "TrendsEditorial[pins_url]" is missing from JSON.');
        assert(json[r'pins_url'] != null, 'Required key "TrendsEditorial[pins_url]" has a null value in JSON.');
        assert(json.containsKey(r'related_keywords'), 'Required key "TrendsEditorial[related_keywords]" is missing from JSON.');
        assert(json[r'related_keywords'] != null, 'Required key "TrendsEditorial[related_keywords]" has a null value in JSON.');
        assert(json.containsKey(r'title'), 'Required key "TrendsEditorial[title]" is missing from JSON.');
        assert(json[r'title'] != null, 'Required key "TrendsEditorial[title]" has a null value in JSON.');
        return true;
      }());

      return TrendsEditorial(
        boardUrl: mapValueOfType<String>(json, r'board_url')!,
        description: mapValueOfType<String>(json, r'description')!,
        interests: json[r'interests'] is Iterable
            ? (json[r'interests'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        pinsUrl: json[r'pins_url'] is Iterable
            ? (json[r'pins_url'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        relatedKeywords: KeywordInfo.listFromJson(json[r'related_keywords']),
        title: mapValueOfType<String>(json, r'title')!,
      );
    }
    return null;
  }

  static List<TrendsEditorial> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TrendsEditorial>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TrendsEditorial.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TrendsEditorial> mapFromJson(dynamic json) {
    final map = <String, TrendsEditorial>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TrendsEditorial.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TrendsEditorial-objects as value to a dart map
  static Map<String, List<TrendsEditorial>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TrendsEditorial>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TrendsEditorial.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'board_url',
    'description',
    'interests',
    'pins_url',
    'related_keywords',
    'title',
  };
}

