//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audience_definition.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_insights_scope_and_type_get200_response.g.dart';

/// AudienceInsightsScopeAndTypeGet200Response
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class AudienceInsightsScopeAndTypeGet200Response implements Built<AudienceInsightsScopeAndTypeGet200Response, AudienceInsightsScopeAndTypeGet200ResponseBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<AudienceDefinition> get items;

  AudienceInsightsScopeAndTypeGet200Response._();

  factory AudienceInsightsScopeAndTypeGet200Response([void updates(AudienceInsightsScopeAndTypeGet200ResponseBuilder b)]) = _$AudienceInsightsScopeAndTypeGet200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AudienceInsightsScopeAndTypeGet200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AudienceInsightsScopeAndTypeGet200Response> get serializer => _$AudienceInsightsScopeAndTypeGet200ResponseSerializer();
}

class _$AudienceInsightsScopeAndTypeGet200ResponseSerializer implements PrimitiveSerializer<AudienceInsightsScopeAndTypeGet200Response> {
  @override
  final Iterable<Type> types = const [AudienceInsightsScopeAndTypeGet200Response, _$AudienceInsightsScopeAndTypeGet200Response];

  @override
  final String wireName = r'AudienceInsightsScopeAndTypeGet200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AudienceInsightsScopeAndTypeGet200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(AudienceDefinition)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AudienceInsightsScopeAndTypeGet200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AudienceInsightsScopeAndTypeGet200ResponseBuilder result,
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
  AudienceInsightsScopeAndTypeGet200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AudienceInsightsScopeAndTypeGet200ResponseBuilder();
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

