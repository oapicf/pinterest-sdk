//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_definition_type.g.dart';

/// Generated audience type to request.
///
/// Properties:
/// * [scope] 
@BuiltValue()
abstract class AudienceDefinitionType implements Built<AudienceDefinitionType, AudienceDefinitionTypeBuilder> {
  @BuiltValueField(wireName: r'scope')
  AudienceDefinitionTypeScopeEnum? get scope;
  // enum scopeEnum {  IMPRESSION_PLUS_ENGAGEMENT,  ENGAGEMENT,  };

  AudienceDefinitionType._();

  factory AudienceDefinitionType([void updates(AudienceDefinitionTypeBuilder b)]) = _$AudienceDefinitionType;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AudienceDefinitionTypeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AudienceDefinitionType> get serializer => _$AudienceDefinitionTypeSerializer();
}

class _$AudienceDefinitionTypeSerializer implements PrimitiveSerializer<AudienceDefinitionType> {
  @override
  final Iterable<Type> types = const [AudienceDefinitionType, _$AudienceDefinitionType];

  @override
  final String wireName = r'AudienceDefinitionType';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AudienceDefinitionType object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.scope != null) {
      yield r'scope';
      yield serializers.serialize(
        object.scope,
        specifiedType: const FullType(AudienceDefinitionTypeScopeEnum),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AudienceDefinitionType object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AudienceDefinitionTypeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'scope':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AudienceDefinitionTypeScopeEnum),
          ) as AudienceDefinitionTypeScopeEnum;
          result.scope = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AudienceDefinitionType deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AudienceDefinitionTypeBuilder();
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

class AudienceDefinitionTypeScopeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'IMPRESSION_PLUS_ENGAGEMENT')
  static const AudienceDefinitionTypeScopeEnum IMPRESSION_PLUS_ENGAGEMENT = _$audienceDefinitionTypeScopeEnum_IMPRESSION_PLUS_ENGAGEMENT;
  @BuiltValueEnumConst(wireName: r'ENGAGEMENT')
  static const AudienceDefinitionTypeScopeEnum ENGAGEMENT = _$audienceDefinitionTypeScopeEnum_ENGAGEMENT;

  static Serializer<AudienceDefinitionTypeScopeEnum> get serializer => _$audienceDefinitionTypeScopeEnumSerializer;

  const AudienceDefinitionTypeScopeEnum._(String name): super(name);

  static BuiltSet<AudienceDefinitionTypeScopeEnum> get values => _$audienceDefinitionTypeScopeEnumValues;
  static AudienceDefinitionTypeScopeEnum valueOf(String name) => _$audienceDefinitionTypeScopeEnumValueOf(name);
}

