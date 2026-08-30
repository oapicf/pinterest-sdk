//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class IntegrationLogClientError {
  /// Returns a new [IntegrationLogClientError] instance.
  IntegrationLogClientError({
    this.cause,
    this.columnNumber,
    this.fileName,
    this.lineNumber,
    this.message,
    this.messageDetail,
    this.name,
    this.number,
    this.stackTrace,
  });

  /// Original cause of the error.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? cause;

  /// Column number in the line of the file that raised the error.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? columnNumber;

  /// Filename where the error happened.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? fileName;

  /// Line number where the error happened.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? lineNumber;

  /// Human-readable description of the error.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? message;

  /// More detail about the message.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? messageDetail;

  /// Filename where the error happened.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  /// Integer that specifies the error code.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? number;

  /// Stack trace of where the error happened.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? stackTrace;

  @override
  bool operator ==(Object other) => identical(this, other) || other is IntegrationLogClientError &&
    other.cause == cause &&
    other.columnNumber == columnNumber &&
    other.fileName == fileName &&
    other.lineNumber == lineNumber &&
    other.message == message &&
    other.messageDetail == messageDetail &&
    other.name == name &&
    other.number == number &&
    other.stackTrace == stackTrace;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cause == null ? 0 : cause!.hashCode) +
    (columnNumber == null ? 0 : columnNumber!.hashCode) +
    (fileName == null ? 0 : fileName!.hashCode) +
    (lineNumber == null ? 0 : lineNumber!.hashCode) +
    (message == null ? 0 : message!.hashCode) +
    (messageDetail == null ? 0 : messageDetail!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (number == null ? 0 : number!.hashCode) +
    (stackTrace == null ? 0 : stackTrace!.hashCode);

  @override
  String toString() => 'IntegrationLogClientError[cause=$cause, columnNumber=$columnNumber, fileName=$fileName, lineNumber=$lineNumber, message=$message, messageDetail=$messageDetail, name=$name, number=$number, stackTrace=$stackTrace]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cause != null) {
      json[r'cause'] = this.cause;
    } else {
      json[r'cause'] = null;
    }
    if (this.columnNumber != null) {
      json[r'column_number'] = this.columnNumber;
    } else {
      json[r'column_number'] = null;
    }
    if (this.fileName != null) {
      json[r'file_name'] = this.fileName;
    } else {
      json[r'file_name'] = null;
    }
    if (this.lineNumber != null) {
      json[r'line_number'] = this.lineNumber;
    } else {
      json[r'line_number'] = null;
    }
    if (this.message != null) {
      json[r'message'] = this.message;
    } else {
      json[r'message'] = null;
    }
    if (this.messageDetail != null) {
      json[r'message_detail'] = this.messageDetail;
    } else {
      json[r'message_detail'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.number != null) {
      json[r'number'] = this.number;
    } else {
      json[r'number'] = null;
    }
    if (this.stackTrace != null) {
      json[r'stack_trace'] = this.stackTrace;
    } else {
      json[r'stack_trace'] = null;
    }
    return json;
  }

  /// Returns a new [IntegrationLogClientError] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static IntegrationLogClientError? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return IntegrationLogClientError(
        cause: mapValueOfType<String>(json, r'cause'),
        columnNumber: mapValueOfType<int>(json, r'column_number'),
        fileName: mapValueOfType<String>(json, r'file_name'),
        lineNumber: mapValueOfType<int>(json, r'line_number'),
        message: mapValueOfType<String>(json, r'message'),
        messageDetail: mapValueOfType<String>(json, r'message_detail'),
        name: mapValueOfType<String>(json, r'name'),
        number: mapValueOfType<int>(json, r'number'),
        stackTrace: mapValueOfType<String>(json, r'stack_trace'),
      );
    }
    return null;
  }

  static List<IntegrationLogClientError> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <IntegrationLogClientError>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = IntegrationLogClientError.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, IntegrationLogClientError> mapFromJson(dynamic json) {
    final map = <String, IntegrationLogClientError>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = IntegrationLogClientError.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of IntegrationLogClientError-objects as value to a dart map
  static Map<String, List<IntegrationLogClientError>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<IntegrationLogClientError>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = IntegrationLogClientError.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

