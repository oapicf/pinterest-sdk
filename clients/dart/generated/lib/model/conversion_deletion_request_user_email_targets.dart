//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionDeletionRequestUserEmailTargets {
  /// Returns a new [ConversionDeletionRequestUserEmailTargets] instance.
  ConversionDeletionRequestUserEmailTargets({
    this.userEmails = const [],
  });

  /// Array of plain text user emails.
  List<String> userEmails;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionDeletionRequestUserEmailTargets &&
    _deepEquality.equals(other.userEmails, userEmails);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (userEmails.hashCode);

  @override
  String toString() => 'ConversionDeletionRequestUserEmailTargets[userEmails=$userEmails]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'user_emails'] = this.userEmails;
    return json;
  }

  /// Returns a new [ConversionDeletionRequestUserEmailTargets] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionDeletionRequestUserEmailTargets? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'user_emails'), 'Required key "ConversionDeletionRequestUserEmailTargets[user_emails]" is missing from JSON.');
        assert(json[r'user_emails'] != null, 'Required key "ConversionDeletionRequestUserEmailTargets[user_emails]" has a null value in JSON.');
        return true;
      }());

      return ConversionDeletionRequestUserEmailTargets(
        userEmails: json[r'user_emails'] is Iterable
            ? (json[r'user_emails'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<ConversionDeletionRequestUserEmailTargets> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionDeletionRequestUserEmailTargets>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionDeletionRequestUserEmailTargets.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionDeletionRequestUserEmailTargets> mapFromJson(dynamic json) {
    final map = <String, ConversionDeletionRequestUserEmailTargets>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionDeletionRequestUserEmailTargets.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionDeletionRequestUserEmailTargets-objects as value to a dart map
  static Map<String, List<ConversionDeletionRequestUserEmailTargets>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionDeletionRequestUserEmailTargets>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionDeletionRequestUserEmailTargets.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'user_emails',
  };
}

