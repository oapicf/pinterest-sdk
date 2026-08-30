//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_account_owner.g.dart';

/// AdAccountOwner
///
/// Properties:
/// * [id] - The owning account's user ID.
/// * [username] - Public username for the user account
@BuiltValue()
abstract class AdAccountOwner implements Built<AdAccountOwner, AdAccountOwnerBuilder> {
  /// The owning account's user ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Public username for the user account
  @BuiltValueField(wireName: r'username')
  String? get username;

  AdAccountOwner._();

  factory AdAccountOwner([void updates(AdAccountOwnerBuilder b)]) = _$AdAccountOwner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdAccountOwnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdAccountOwner> get serializer => _$AdAccountOwnerSerializer();
}

class _$AdAccountOwnerSerializer implements PrimitiveSerializer<AdAccountOwner> {
  @override
  final Iterable<Type> types = const [AdAccountOwner, _$AdAccountOwner];

  @override
  final String wireName = r'AdAccountOwner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdAccountOwner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.username != null) {
      yield r'username';
      yield serializers.serialize(
        object.username,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdAccountOwner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdAccountOwnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.id = valueDes;
          break;
        case r'username':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.username = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdAccountOwner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdAccountOwnerBuilder();
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

