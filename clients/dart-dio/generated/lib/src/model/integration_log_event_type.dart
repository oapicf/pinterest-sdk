//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'integration_log_event_type.g.dart';

class IntegrationLogEventType extends EnumClass {

  /// Log event type for integration applications.
  @BuiltValueEnumConst(wireName: r'APP')
  static const IntegrationLogEventType APP = _$APP;
  /// Log event type for integration applications.
  @BuiltValueEnumConst(wireName: r'API')
  static const IntegrationLogEventType API = _$API;

  static Serializer<IntegrationLogEventType> get serializer => _$integrationLogEventTypeSerializer;

  const IntegrationLogEventType._(String name): super(name);

  static BuiltSet<IntegrationLogEventType> get values => _$values;
  static IntegrationLogEventType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class IntegrationLogEventTypeMixin = Object with _$IntegrationLogEventTypeMixin;

