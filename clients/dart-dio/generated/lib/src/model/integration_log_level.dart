//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'integration_log_level.g.dart';

class IntegrationLogLevel extends EnumClass {

  /// Log level type for integration applications.
  @BuiltValueEnumConst(wireName: r'INFO')
  static const IntegrationLogLevel INFO = _$INFO;
  /// Log level type for integration applications.
  @BuiltValueEnumConst(wireName: r'WARN')
  static const IntegrationLogLevel WARN = _$WARN;
  /// Log level type for integration applications.
  @BuiltValueEnumConst(wireName: r'ERROR')
  static const IntegrationLogLevel ERROR = _$ERROR;

  static Serializer<IntegrationLogLevel> get serializer => _$integrationLogLevelSerializer;

  const IntegrationLogLevel._(String name): super(name);

  static BuiltSet<IntegrationLogLevel> get values => _$values;
  static IntegrationLogLevel valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class IntegrationLogLevelMixin = Object with _$IntegrationLogLevelMixin;

