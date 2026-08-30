//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/integration_record.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'integrations_get_list200_response.g.dart';

/// IntegrationsGetList200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class IntegrationsGetList200Response implements Built<IntegrationsGetList200Response, IntegrationsGetList200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<IntegrationRecord> get items;

  IntegrationsGetList200Response._();

  factory IntegrationsGetList200Response([void updates(IntegrationsGetList200ResponseBuilder b)]) = _$IntegrationsGetList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(IntegrationsGetList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<IntegrationsGetList200Response> get serializer => _$IntegrationsGetList200ResponseSerializer();
}

class _$IntegrationsGetList200ResponseSerializer implements PrimitiveSerializer<IntegrationsGetList200Response> {
  @override
  final Iterable<Type> types = const [IntegrationsGetList200Response, _$IntegrationsGetList200Response];

  @override
  final String wireName = r'IntegrationsGetList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    IntegrationsGetList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.bookmark != null) {
      yield r'bookmark';
      yield serializers.serialize(
        object.bookmark,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(IntegrationRecord)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    IntegrationsGetList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required IntegrationsGetList200ResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'bookmark':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.bookmark = valueDes;
          break;
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(IntegrationRecord)]),
          ) as BuiltList<IntegrationRecord>;
          result.items.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  IntegrationsGetList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = IntegrationsGetList200ResponseBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

