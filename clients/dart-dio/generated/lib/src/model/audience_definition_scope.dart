//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_definition_scope.g.dart';

/// Generated audience scope to request.
///
/// Properties:
/// * [scope] 
@BuiltValue()
abstract class AudienceDefinitionScope implements Built<AudienceDefinitionScope, AudienceDefinitionScopeBuilder> {
  @BuiltValueField(wireName: r'scope')
  AudienceDefinitionScopeScopeEnum? get scope;
  // enum scopeEnum {  PARTNER,  PINTEREST,  };

  AudienceDefinitionScope._();

  factory AudienceDefinitionScope([void updates(AudienceDefinitionScopeBuilder b)]) = _$AudienceDefinitionScope;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AudienceDefinitionScopeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AudienceDefinitionScope> get serializer => _$AudienceDefinitionScopeSerializer();
}

class _$AudienceDefinitionScopeSerializer implements PrimitiveSerializer<AudienceDefinitionScope> {
  @override
  final Iterable<Type> types = const [AudienceDefinitionScope, _$AudienceDefinitionScope];

  @override
  final String wireName = r'AudienceDefinitionScope';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AudienceDefinitionScope object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.scope != null) {
      yield r'scope';
      yield serializers.serialize(
        object.scope,
        specifiedType: const FullType(AudienceDefinitionScopeScopeEnum),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AudienceDefinitionScope object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AudienceDefinitionScopeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'scope':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AudienceDefinitionScopeScopeEnum),
          ) as AudienceDefinitionScopeScopeEnum;
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
  AudienceDefinitionScope deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AudienceDefinitionScopeBuilder();
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

class AudienceDefinitionScopeScopeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'PARTNER')
  static const AudienceDefinitionScopeScopeEnum PARTNER = _$audienceDefinitionScopeScopeEnum_PARTNER;
  @BuiltValueEnumConst(wireName: r'PINTEREST')
  static const AudienceDefinitionScopeScopeEnum PINTEREST = _$audienceDefinitionScopeScopeEnum_PINTEREST;

  static Serializer<AudienceDefinitionScopeScopeEnum> get serializer => _$audienceDefinitionScopeScopeEnumSerializer;

  const AudienceDefinitionScopeScopeEnum._(String name): super(name);

  static BuiltSet<AudienceDefinitionScopeScopeEnum> get values => _$audienceDefinitionScopeScopeEnumValues;
  static AudienceDefinitionScopeScopeEnum valueOf(String name) => _$audienceDefinitionScopeScopeEnumValueOf(name);
}

