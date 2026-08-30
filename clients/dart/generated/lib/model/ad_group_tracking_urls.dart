//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdGroupTrackingURLs {
  /// Returns a new [AdGroupTrackingURLs] instance.
  AdGroupTrackingURLs({
    this.audienceVerification = const [],
    this.buyableButton = const [],
    this.click = const [],
    this.engagement = const [],
    this.impression = const [],
  });

  List<String> audienceVerification;

  List<String> buyableButton;

  List<String> click;

  List<String> engagement;

  List<String> impression;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdGroupTrackingURLs &&
    _deepEquality.equals(other.audienceVerification, audienceVerification) &&
    _deepEquality.equals(other.buyableButton, buyableButton) &&
    _deepEquality.equals(other.click, click) &&
    _deepEquality.equals(other.engagement, engagement) &&
    _deepEquality.equals(other.impression, impression);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (audienceVerification.hashCode) +
    (buyableButton.hashCode) +
    (click.hashCode) +
    (engagement.hashCode) +
    (impression.hashCode);

  @override
  String toString() => 'AdGroupTrackingURLs[audienceVerification=$audienceVerification, buyableButton=$buyableButton, click=$click, engagement=$engagement, impression=$impression]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'audience_verification'] = this.audienceVerification;
      json[r'buyable_button'] = this.buyableButton;
      json[r'click'] = this.click;
      json[r'engagement'] = this.engagement;
      json[r'impression'] = this.impression;
    return json;
  }

  /// Returns a new [AdGroupTrackingURLs] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdGroupTrackingURLs? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return AdGroupTrackingURLs(
        audienceVerification: json[r'audience_verification'] is Iterable
            ? (json[r'audience_verification'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        buyableButton: json[r'buyable_button'] is Iterable
            ? (json[r'buyable_button'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        click: json[r'click'] is Iterable
            ? (json[r'click'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        engagement: json[r'engagement'] is Iterable
            ? (json[r'engagement'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        impression: json[r'impression'] is Iterable
            ? (json[r'impression'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<AdGroupTrackingURLs> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdGroupTrackingURLs>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdGroupTrackingURLs.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdGroupTrackingURLs> mapFromJson(dynamic json) {
    final map = <String, AdGroupTrackingURLs>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdGroupTrackingURLs.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdGroupTrackingURLs-objects as value to a dart map
  static Map<String, List<AdGroupTrackingURLs>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdGroupTrackingURLs>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdGroupTrackingURLs.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

