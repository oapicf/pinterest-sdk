//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'billing_invoice_download_response.g.dart';

/// BillingInvoiceDownloadResponse
///
/// Properties:
/// * [downloadUrl] - The download url for the billing invoice
/// * [id] - The billing invoice id
@BuiltValue()
abstract class BillingInvoiceDownloadResponse implements Built<BillingInvoiceDownloadResponse, BillingInvoiceDownloadResponseBuilder> {
  /// The download url for the billing invoice
  @BuiltValueField(wireName: r'download_url')
  String? get downloadUrl;

  /// The billing invoice id
  @BuiltValueField(wireName: r'id')
  String? get id;

  BillingInvoiceDownloadResponse._();

  factory BillingInvoiceDownloadResponse([void updates(BillingInvoiceDownloadResponseBuilder b)]) = _$BillingInvoiceDownloadResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BillingInvoiceDownloadResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BillingInvoiceDownloadResponse> get serializer => _$BillingInvoiceDownloadResponseSerializer();
}

class _$BillingInvoiceDownloadResponseSerializer implements PrimitiveSerializer<BillingInvoiceDownloadResponse> {
  @override
  final Iterable<Type> types = const [BillingInvoiceDownloadResponse, _$BillingInvoiceDownloadResponse];

  @override
  final String wireName = r'BillingInvoiceDownloadResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BillingInvoiceDownloadResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.downloadUrl != null) {
      yield r'download_url';
      yield serializers.serialize(
        object.downloadUrl,
        specifiedType: const FullType(String),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BillingInvoiceDownloadResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BillingInvoiceDownloadResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'download_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.downloadUrl = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.id = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BillingInvoiceDownloadResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BillingInvoiceDownloadResponseBuilder();
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

