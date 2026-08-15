//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audience_definition.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_definition_response.g.dart';

/// AudienceDefinitionResponse
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class AudienceDefinitionResponse implements Built<AudienceDefinitionResponse, AudienceDefinitionResponseBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<AudienceDefinition>? get items;

  AudienceDefinitionResponse._();

  factory AudienceDefinitionResponse([void updates(AudienceDefinitionResponseBuilder b)]) = _$AudienceDefinitionResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AudienceDefinitionResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AudienceDefinitionResponse> get serializer => _$AudienceDefinitionResponseSerializer();
}

class _$AudienceDefinitionResponseSerializer implements PrimitiveSerializer<AudienceDefinitionResponse> {
  @override
  final Iterable<Type> types = const [AudienceDefinitionResponse, _$AudienceDefinitionResponse];

  @override
  final String wireName = r'AudienceDefinitionResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AudienceDefinitionResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(AudienceDefinition)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AudienceDefinitionResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AudienceDefinitionResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AudienceDefinition)]),
          ) as BuiltList<AudienceDefinition>;
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
  AudienceDefinitionResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AudienceDefinitionResponseBuilder();
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

