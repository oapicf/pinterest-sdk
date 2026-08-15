//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/detailed_error.dart';
import 'package:openapi/src/model/error.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'integrations_logs_post400_response.g.dart';

/// IntegrationsLogsPost400Response
///
/// Properties:
/// * [code] 
/// * [message] 
/// * [details] 
@BuiltValue()
abstract class IntegrationsLogsPost400Response implements Built<IntegrationsLogsPost400Response, IntegrationsLogsPost400ResponseBuilder> {
  /// Any Of [DetailedError], [Error]
  AnyOf get anyOf;

  IntegrationsLogsPost400Response._();

  factory IntegrationsLogsPost400Response([void updates(IntegrationsLogsPost400ResponseBuilder b)]) = _$IntegrationsLogsPost400Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(IntegrationsLogsPost400ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<IntegrationsLogsPost400Response> get serializer => _$IntegrationsLogsPost400ResponseSerializer();
}

class _$IntegrationsLogsPost400ResponseSerializer implements PrimitiveSerializer<IntegrationsLogsPost400Response> {
  @override
  final Iterable<Type> types = const [IntegrationsLogsPost400Response, _$IntegrationsLogsPost400Response];

  @override
  final String wireName = r'IntegrationsLogsPost400Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    IntegrationsLogsPost400Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    IntegrationsLogsPost400Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  IntegrationsLogsPost400Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = IntegrationsLogsPost400ResponseBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(Error), FullType(DetailedError), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

