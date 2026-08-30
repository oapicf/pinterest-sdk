//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_deletion_request_user_email_targets.g.dart';

/// ConversionDeletionRequestUserEmailTargets
///
/// Properties:
/// * [userEmails] - Array of plain text user emails.
@BuiltValue()
abstract class ConversionDeletionRequestUserEmailTargets implements Built<ConversionDeletionRequestUserEmailTargets, ConversionDeletionRequestUserEmailTargetsBuilder> {
  /// Array of plain text user emails.
  @BuiltValueField(wireName: r'user_emails')
  BuiltList<String> get userEmails;

  ConversionDeletionRequestUserEmailTargets._();

  factory ConversionDeletionRequestUserEmailTargets([void updates(ConversionDeletionRequestUserEmailTargetsBuilder b)]) = _$ConversionDeletionRequestUserEmailTargets;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionDeletionRequestUserEmailTargetsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionDeletionRequestUserEmailTargets> get serializer => _$ConversionDeletionRequestUserEmailTargetsSerializer();
}

class _$ConversionDeletionRequestUserEmailTargetsSerializer implements PrimitiveSerializer<ConversionDeletionRequestUserEmailTargets> {
  @override
  final Iterable<Type> types = const [ConversionDeletionRequestUserEmailTargets, _$ConversionDeletionRequestUserEmailTargets];

  @override
  final String wireName = r'ConversionDeletionRequestUserEmailTargets';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionDeletionRequestUserEmailTargets object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'user_emails';
    yield serializers.serialize(
      object.userEmails,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionDeletionRequestUserEmailTargets object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionDeletionRequestUserEmailTargetsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'user_emails':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.userEmails.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConversionDeletionRequestUserEmailTargets deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionDeletionRequestUserEmailTargetsBuilder();
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

