//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/targeting_template.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_template_list200_response.g.dart';

/// TargetingTemplateList200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class TargetingTemplateList200Response implements Built<TargetingTemplateList200Response, TargetingTemplateList200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<TargetingTemplate> get items;

  TargetingTemplateList200Response._();

  factory TargetingTemplateList200Response([void updates(TargetingTemplateList200ResponseBuilder b)]) = _$TargetingTemplateList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingTemplateList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingTemplateList200Response> get serializer => _$TargetingTemplateList200ResponseSerializer();
}

class _$TargetingTemplateList200ResponseSerializer implements PrimitiveSerializer<TargetingTemplateList200Response> {
  @override
  final Iterable<Type> types = const [TargetingTemplateList200Response, _$TargetingTemplateList200Response];

  @override
  final String wireName = r'TargetingTemplateList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingTemplateList200Response object, {
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
      specifiedType: const FullType(BuiltList, [FullType(TargetingTemplate)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    TargetingTemplateList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingTemplateList200ResponseBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(TargetingTemplate)]),
          ) as BuiltList<TargetingTemplate>;
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
  TargetingTemplateList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingTemplateList200ResponseBuilder();
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

